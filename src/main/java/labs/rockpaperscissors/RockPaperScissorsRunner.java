package labs.rockpaperscissors;

import java.util.Optional;
import java.util.Scanner;

public class RockPaperScissorsRunner {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        final String possibleMoves = RockPaperScissors.serializePossibleMoves();

        final RockPaperScissors.Game game = new RockPaperScissors.Game();

        while (true) {
            System.out.printf("Enter one of the following moves:\n%s\n", possibleMoves);
            final Optional<RockPaperScissors.Move> userOptionalMove = RockPaperScissors.getUserMove();
            if (userOptionalMove.isEmpty()) {
                System.out.println("You failed to enter a move. Game resetting.");
                continue;
            }

            final RockPaperScissors.Move computerMove = RockPaperScissors.getComputerMove();

            final RockPaperScissors.Move userMove = userOptionalMove.orElseThrow();
            System.out.printf("You played %s!%n", userMove);
            System.out.printf("Computer played %s!%n", computerMove);

            final RockPaperScissors.Winner winner = RockPaperScissors.getWinningPlayer(userMove, computerMove);
            switch (winner) {
                case USER -> {
                    game.addScore(winner, 1);
                    System.out.println("You win!");
                }
                case COMPUTER -> {
                    game.addScore(winner, 1);
                    System.out.println("You lost!");
                }
                case TIE -> System.out.println("You tied!");
            }

            System.out.println("Do you want to keep playing? (y/n)");
            if (!"y".equalsIgnoreCase(inputScanner.nextLine()))
                break;
        }

        final RockPaperScissors.Winner overallWinner = game.computeWinner();
        final int userScore = game.getScore(RockPaperScissors.Winner.USER);
        final int computerScore = game.getScore(RockPaperScissors.Winner.COMPUTER);

        switch (overallWinner) {
            case USER -> System.out.printf("You won overall with a score of %d against %d!%n", userScore, computerScore);
            case COMPUTER -> System.out.printf("The computer won overall with a score of %d against your %d wins!%n", computerScore, userScore);
            case TIE -> System.out.printf("You tied with the computer overall, you both scored %d!%n", userScore);
        }
    }
}
