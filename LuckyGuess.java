package com.company;

import java.util.*;

public class LuckyGuess {

    // Method to handle the game logic
    static void playGame(int randomNumber, Scanner sc) {
        int max_attempt = 5, attempts = 0; // Maximum allowed attempts and attempt counter
        
        while (max_attempt > 0) {
            System.out.println("Guess the number? ");
            
            int userGuess = sc.nextInt(); 
            attempts++; 

            // If user guesses correctly
            if (userGuess == randomNumber) {
                System.out.println("You won!!");
                System.out.println("Attempts taken: " + attempts);
                break;
            }

            // If guess is too high
            else if (userGuess > randomNumber) {
                if (max_attempt == 1) { 
                    System.out.println("Sorry.. you lose");
                    System.out.println("The correct number is: " + randomNumber);
                } else {
                    System.out.println("Sorry, too high!");
                }
            }
            
            // If guess is too low
            else {
                if (max_attempt == 1) { 
                    System.out.println("Sorry.. you lose");
                    System.out.println("The correct number is: " + randomNumber);
                } else {
                    System.out.println("Sorry, too low!");
                }
            }
            max_attempt--; // Decrease remaining attempts
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100

       
        System.out.println("Let's start the game!");
        System.out.println("I have generated a random number between 1 and 100. Try to guess the number.");

        playGame(randomNumber, sc); 

        // Ask user if they want to play again
        while (true) {
            System.out.println("Do you want to play the game again? (yes/no)");
            String reply = sc.next();

            if (reply.equalsIgnoreCase("yes")) {
                randomNumber = random.nextInt(100) + 1; // Generate a new random number for the next round
                playGame(randomNumber, sc);
            } else {
                System.out.println("Thank you for playing the game.");
                break;
            }
        }
        sc.close(); // Close the scanner 
    }
}
