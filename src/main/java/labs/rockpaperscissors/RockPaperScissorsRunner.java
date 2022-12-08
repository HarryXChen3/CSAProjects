package labs.rockpaperscissors;

import java.util.Optional;
import java.util.Scanner;

public class RockPaperScissorsRunner {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        final String possibleMoves = RockPaperScissors.serializePossibleMoves();
        while (true) {
            System.out.printf("Enter one of the following moves:\n%s", possibleMoves);
            final Optional<RockPaperScissors.Move> userMove = RockPaperScissors.getUserMove();
            if (userMove.isEmpty()) {
                System.out.println("You failed to enter a move. Game resetting.");
                continue;
            }

            final RockPaperScissors.Move computerMove = RockPaperScissors.getComputerMove();

            final RockPaperScissors.Winner winner = RockPaperScissors.getWinningPlayer(userMove.get(), computerMove);
            switch (winner) {
                case USER -> System.out.println("You win!");
                case COMPUTER -> System.out.println("You lost!");
                case TIE -> System.out.println("You tied!");
            }
        }
    }
}
