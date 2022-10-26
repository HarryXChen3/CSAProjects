package truthtable;

import truthtable.gates.OUT;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TruthTableGenerator {
    private static final Gates OUT_GATE = Gates.OUT;
    private final List<Map<String, Boolean>> inputStates;
    private final Map<String, List<Gate>> gateInputMap;

    private static boolean[] bitSetToArray(final BitSet bitSet, final int width) {
        final boolean[] result = new boolean[width];
        bitSet.stream().forEach(i -> result[i] = true);
        return result;
    }

    private static List<boolean[]> boolInputSampleSpace(final int inputSize) {
        return IntStream.range(0, (int)Math.pow(2, inputSize))
                .mapToObj(i -> bitSetToArray(BitSet.valueOf(new long[] {i}), inputSize))
                .toList();
    }

    public TruthTableGenerator(final Map<String, List<Gate>> gateInputMap) {
        this.gateInputMap = gateInputMap;
        final OUT expectedOUTGate = gateInputMap
                .values()
                .stream()
                .findFirst()
                .orElseThrow()
                .stream()
                .filter(gate -> gate instanceof OUT)
                .map(gate -> (OUT)gate)
                .findFirst()
                .orElseThrow();

        if (!gateInputMap
                .values()
                .stream()
                .allMatch(l -> l.contains(expectedOUTGate)))
            throw new RuntimeException("TruthTableGenerator expected single OUT gate");

        final int inputSize = gateInputMap.size();
        this.inputStates = new ArrayList<>((int)Math.pow(2, inputSize));

        final List<String> inputKeys = new ArrayList<>(gateInputMap.keySet());
        final List<boolean[]> sampleSpace = boolInputSampleSpace(inputSize);
        sampleSpace
                .forEach(input -> inputStates.add(
                        IntStream.range(0, inputKeys.size()).boxed()
                                .collect(Collectors.toMap(inputKeys::get, i -> input[i]))
                ));
    }

    public HashMap<Map<String, Boolean>, Boolean> compute() {
        final HashMap<Map<String, Boolean>, Boolean> result = new HashMap<>(inputStates.size());

        final Collection<List<Gate>> collectedGates = gateInputMap.values();
        final List<Gate> reducedGates = gateInputMap
                .values()
                .stream()
                .reduce(collectedGates
                                .stream()
                                .flatMap(List::stream)
                                .collect(Collectors.toList()),
                        (retained, gates) -> {
                            retained.retainAll(gates);
                            return retained;
                        });
        final HashMap<Gate, List<Boolean>> gateResults = new HashMap<>(reducedGates.size());

        for (final Map<String, Boolean> inputMap : inputStates) {
            for (final Map.Entry<String, List<Gate>> entry : gateInputMap.entrySet()) {
                final String inputKey = entry.getKey();
                final boolean input = inputMap.get(inputKey);
                final List<Gate> gates = entry.getValue();

                for (final ListIterator<Gate> iterator = gates.listIterator(); iterator.hasNext();) {
                    final int previousIndex = iterator.previousIndex();
                    final int nextIndex = iterator.nextIndex();

                    final Gate nextGate = iterator.next();
                    final Gates nextGateType = nextGate.getGate();

                    if (nextGateType == OUT_GATE) {
                        final List<Boolean> OUTResults = previousIndex == -1
                                ? nextGate.compute(input)
                                : gateResults.get(gates.get(previousIndex));

                        if (OUTResults.size() != 1)
                            throw new RuntimeException("Expected OUT gate to output single result");

                        result.put(inputMap, OUTResults.get(0));
                    }

                    if (previousIndex == -1) {
                        if (nextGateType.getIn() == 1)
                            gateResults.put(nextGate, nextGate.compute(input));
                        else {
                            final List<String> requiredInputKeys = gateInputMap.entrySet()
                                    .stream()
                                    .filter(inputEntry -> {
                                        final List<Gate> inputGates = inputEntry.getValue();
                                        return inputGates.contains(nextGate);
                                    })
                                    .map(Map.Entry::getKey)
                                    .toList();

                            final List<Boolean> requiredInputs = inputMap.entrySet()
                                    .stream()
                                    .filter(inputEntry -> requiredInputKeys.contains(entry.getKey()))
                                    .map(Map.Entry::getValue)
                                    .toList();

                            gateResults.put(nextGate, nextGate.compute(requiredInputs));
                        }
                    } else {
                        final Gate previousGate = gates.get(previousIndex);
                        if (nextGateType.getIn() == 1)
                            gateResults.put(nextGate, nextGate.compute(gateResults.get(previousGate)));
                        else {
                            final Map<String, Integer> outputGateKeys = gateInputMap.entrySet()
                                    .stream()
                                    .filter(outputEntry -> {
                                        final List<Gate> outputGates = outputEntry.getValue();
                                        return outputGates.contains(nextGate);
                                    })
                                    .collect(Collectors.toMap(Map.Entry::getKey, outputEntry -> outputEntry
                                            .getValue().indexOf(nextGate)
                                    ));

                            final List<Boolean> requiredInputs = outputGateKeys.entrySet()
                                    .stream()
                                    .map(outputEntry -> {
                                        final String nextGateKey = outputEntry.getKey();
                                        final int nextGateIndex = outputEntry.getValue();
                                        final List<Gate> outputGates = gateInputMap.get(nextGateKey);
                                        if (nextGateIndex <= 0)
                                            return Collections.singletonList(inputMap.get(nextGateKey));
                                        else
                                            return gateResults.get(outputGates.get(nextGateIndex - 1));
                                    })
                                    .flatMap(List::stream)
                                    .toList();

                            gateResults.put(nextGate, nextGate.compute(requiredInputs));
                        }
                    }
                }
            }
        }

        return result;
    }


}
