import java.util.*;


public class numbergame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Number game!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Step 1: Generate a random number within the specified range
            Random random = new Random();
            int secretNumber = random.nextInt(100) + 1;

            // Additional details
            int attemptsLimit = 10;
            int attemptsTaken = 0;

           

            while (true) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Enter your guess (between 1 and 100): ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                attemptsTaken++;
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number " + secretNumber +
                            " correctly in " + attemptsTaken + " attempts.");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again!");
                } else {
                    System.out.println("Too high. Try again!");
                }

                // Check if the user has reached the attempts limit
                if (attemptsTaken == attemptsLimit) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. " +
                            "The correct number was " + secretNumber + ".");
                    break;
                }
            }

            // Additional details: Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your final score is: " + attemptsTaken);
                break;
            }
        }
        scanner.close();
    }
}

