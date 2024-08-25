import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        
        while (playAgain) {
            
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int userGuess = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");

           
            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                
                
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); 
                    System.out.print("Enter your guess: ");
                }
                
                userGuess = scanner.nextInt();
                
               
                attempts++;
                
                
                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("It took you " + attempts + " attempts.");
                }
            }
        
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing! Goodbye.");
            }
        }

        scanner.close();
    }
}
