package sandbox.benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BenchmarkListAdd {
    public static final int n = 100000;

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public static List<Integer> process1() {
        List<Integer> someList = new ArrayList<>();
        for (int k = 0; k < n; k++)
            someList.add(k);
        return someList;
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public static List<Integer> process2() {
        List<Integer> someList = new ArrayList<>();
        for (int k = 0; k < n; k++)
            someList.add(k, k);
        return someList;
    }

    public static void main(final String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}
