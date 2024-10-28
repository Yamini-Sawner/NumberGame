
import java.util.Random;
import java.util.Scanner;

public class Game_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roundsWon = 0;
        int totalRounds = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int numberToGuess = new Random().nextInt(100) + 1;
            int attemptsLeft = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess the number between 1 and 100. You have " + attemptsLeft + " attempts.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You guessed the number.");
                    roundsWon++;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high.");
                } else {
                    System.out.println("Too low.");
                }

                if (attemptsLeft > 0) {
                    System.out.println(attemptsLeft + " attempts left.");
                }
            }

            totalRounds++;
            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The correct number was " + numberToGuess + ".");
            }

            System.out.println("Score: " + roundsWon + " out of " + totalRounds + " rounds won.");

            System.out.print("Play another round? (yes/no): ");
            scanner.nextLine();
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing! Final Score: " + roundsWon + " out of " + totalRounds + " rounds won.");
                break;
            }
        }
    }
}

