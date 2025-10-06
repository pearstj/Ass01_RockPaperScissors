//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerA, playerB, playAgain;

        do {
            // Get Player A's move with validation
            do {
                System.out.print("Player A, enter your move [R/P/S]: ");
                playerA = scan.nextLine();

                if (!playerA.equalsIgnoreCase("R") &&
                        !playerA.equalsIgnoreCase("P") &&
                        !playerA.equalsIgnoreCase("S")) {
                    System.out.println("Invalid move! Please enter R, P, or S.");
                }
            } while (!playerA.equalsIgnoreCase("R") &&
                    !playerA.equalsIgnoreCase("P") &&
                    !playerA.equalsIgnoreCase("S"));
            // Get Players B's move with validation
            do {
                System.out.print("Player B, enter your move [R/P/S]: ");
                playerB = scan.nextLine();

                if (!playerB.equalsIgnoreCase("R") &&
                        !playerB.equalsIgnoreCase("P") &&
                        !playerB.equalsIgnoreCase("S")) {
                    System.out.println("Invalid move! Please enter R, P, or S.");
                }
            } while (!playerB.equalsIgnoreCase("R") &&
                    !playerB.equalsIgnoreCase("P") &&
                    !playerB.equalsIgnoreCase("S"));

            // Convert to uppercase for easier comparison
            playerA = playerA.toUpperCase();
            playerB = playerB.toUpperCase();

            // Display results
            System.out.println("\nPlayer A chose: " + playerA);
            System.out.println("Player B chose: " + playerB);
            System.out.println();

            // Determine winner
            if (playerA.equals(playerB)) {
                // It's a tie
                if (playerA.equals("R")) {
                    System.out.println("Rock vs Rock it's a Tie!");
                } else if (playerA.equals("P")) {
                    System.out.println("Paper vs Paper it's a Tie!");
                } else {
                    System.out.println("Scissors vs Scissors it's a Tie!");
                }

            } else if (playerA.equals("R") && playerB.equals("S")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player A wins!");
            } else if (playerA.equals("S") && playerB.equals("R")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player B wins!");
            } else if (playerA.equals("P") && playerB.equals("R")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player A wins!");
            } else if (playerA.equals("R") && playerB.equals("R")) {
                System.out.println("{Paper covers Rock");
                System.out.println("Player B wins!");
            } else if (playerA.equals("S") && playerB.equals("P")) {
                System.out.println("Scissors cut Papers");
                System.out.println("Player A wins!");
            } else if (playerA.equals("P") && playerB.equals("P")) {
                System.out.println("Scissors cut Papers");
                System.out.println("Player B wins!");
            }

            // Ask to play again
            System.out.println("\nPlay again? [Y/N]:");
            playAgain = scan.nextLine();
            System.out.println();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        scan.close();
    }
}