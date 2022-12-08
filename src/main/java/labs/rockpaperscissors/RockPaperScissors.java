package labs.rockpaperscissors;

import java.util.*;

public class RockPaperScissors {
    private static final Scanner inputScanner = new Scanner(System.in);
    private static final int RETRY_COUNT = 6;

    public enum Winner {
        COMPUTER,
        USER,
        TIE,
    }

    public enum Move {
        ROCK,
        PAPER,
        SCISSORS;

        static {
            ROCK.winsAgainst = SCISSORS;
            PAPER.winsAgainst = ROCK;
            SCISSORS.winsAgainst = PAPER;
        }

        private Move winsAgainst;

        public Move getWinsAgainst() { return winsAgainst; }
        public boolean winsAgainst(final Move move) {
            return move == winsAgainst;
        }
    }

    private static <E> Optional<E> getRandom(final Collection<E> collection) {
        return collection.stream()
                .skip((int)(collection.size() * Math.random()))
                .findFirst();
    }

    public static List<Move> getPossibleMoves() {
        return Arrays.asList(Move.class.getEnumConstants());
    }

    public static String serializePossibleMoves(final Collection<Move> moves) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (final Move move : moves) {
            stringBuilder.append(String.format("%s, ", move.toString().toLowerCase()));
        }

        final int length = stringBuilder.length();
        stringBuilder.delete(length - 2, length);
        return stringBuilder.toString();
    }

    public static String serializePossibleMoves() {
        return serializePossibleMoves(getPossibleMoves());
    }

    public static Optional<Move> getUserMove() {
        for (int i = 0; i < RETRY_COUNT; i++) {
            final String nextLine = inputScanner.nextLine();
            try {
                return Optional.of(Move.valueOf(nextLine.toUpperCase()));
            } catch (final IllegalArgumentException illegalArgumentException) {
                System.out.printf("\"%s\" isn't a valid move! Try again (%d attempts left)%n", nextLine, RETRY_COUNT - i - 1);
            }
        }

        return Optional.empty();
    }

    public static Move getComputerMove() {
        final Optional<Move> moveOptional = getRandom(getPossibleMoves());
        return moveOptional.orElseThrow();
    }

    public static Winner getWinningPlayer(final Move userMove, final Move computerMove) {
        if (userMove == computerMove)
            return Winner.TIE;

        if (userMove.winsAgainst(computerMove))
            return Winner.USER;
        else
            return Winner.COMPUTER;
    }
}
