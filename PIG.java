package com.company;

import java.util.Scanner;
import java.util.Random;

public class PIG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Display game instructions
        System.out.println("* See how many turns it takes you to get to 20.");
        System.out.println("* Turn ends when you hold or roll a 1.");
        System.out.println("* If you roll a 1, you lose all points for the turn.");
        System.out.println("* If you hold, you save all points for the turn.");

        System.out.println("Let's Start Rolling!");

        
        int currentTotal = 0; // Keeps track of the total score
        int i = 1; // Turn counter
        int temporaryTurnValue = 0; // Stores temporary turn points

        
        while (currentTotal < 20)
        {
            int turnTotal = 0; 
            System.out.println("TURN " + i);
            String diceDecision = "roll"; 

            
            while (diceDecision.equalsIgnoreCase("roll") || diceDecision.equalsIgnoreCase("r"))
            {
                System.out.print("Do you want to roll or hold? (R/H): ");
                diceDecision = scanner.nextLine(); 

                if (diceDecision.equalsIgnoreCase("r") || diceDecision.equalsIgnoreCase("roll"))
                {
                    int diceOutput = random.nextInt(6) + 1; 
                    System.out.println("You got a: " + diceOutput);

                    
                    if (diceOutput == 1)
                    {
                        System.out.println("Turn Over :(");
                        currentTotal = currentTotal - temporaryTurnValue;
                        break; // End the turn
                    }

                    
                    temporaryTurnValue += diceOutput;
                    turnTotal = diceOutput;
                    currentTotal += turnTotal;

                    
                    if (currentTotal >= 20)
                    {
                        System.out.println("Turn Total: " + turnTotal);
                        System.out.println("Total score: " + currentTotal);
                        System.out.println("You finished in " + i + " turns");
                        System.out.println("Game Over!");
                        return; 
                    }
                }
            }

            
            temporaryTurnValue = 0;
            System.out.println("Total score: " + currentTotal);
            i++; 
        }

        scanner.close(); // Close the scanner
    }
}
