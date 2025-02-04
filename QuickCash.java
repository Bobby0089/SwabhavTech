package com.company;

import java.util.Scanner;

public class QuickCash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display welcome message and available denominations
        System.out.println("Welcome to QuickCash!");
        System.out.println("Available denominations: Rs 2000, Rs 500, Rs 200, Rs 100");

       
        System.out.print("Enter the amount you want to withdraw: ");
        int amount = sc.nextInt();

        // Check if the amount exceeds the withdrawal limit
        if (amount > 50000)
        {
            System.out.println("Amount exceeds withdrawal limit of Rs 50,000.");
            return;
        }

        // Ensure the amount is a multiple of 100
        if (amount % 100 != 0)
        {
            System.out.println("Amount should be in multiples of Rs 100.");
            return;
        }

        // Display the entered amount
        System.out.println("\nWithdrawal Breakdown:");
        
        int temp = amount; // Temporary variable to store the remaining amount

        // Calculate the number of Rs 2000 notes
        amount %= 2000;
        int a = temp / 2000;
        if (a != 0) 
            System.out.println("Two Thousand : " + a);
        
        temp = amount; // Update temp 

        // Calculate the number of Rs 500 notes
        amount %= 500;
        int b = temp / 500;
        if (b != 0) 
            System.out.println("Five Hundred : " + b);
        
        temp = amount; // Update temp 

        // Calculate the number of Rs 200 notes
        amount %= 200;
        int c = temp / 200;
        if (c != 0) 
            System.out.println("Two Hundred : " + c);
        
        temp = amount; // Update temp

        // Calculate the number of Rs 100 notes
        amount %= 100;
        int d = temp / 100;
        if (d != 0) 
            System.out.println("One Hundred : " + d);
        
        sc.close(); // Close the scanner 
    }
}
