package com.company;

import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of units consumed
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Set meter charge
        int meterCharge = 75;
        int charge;

        // Determine charge based on units consumed
        if (unitsConsumed <= 100)
        {
            charge = unitsConsumed * 5;
        } else if (unitsConsumed <= 250)
        {
            charge = unitsConsumed * 10;
        } else
        {
            charge = unitsConsumed * 20;
        }

        // Calculate total water bill
        int totalWaterBill = charge + meterCharge;

        
        System.out.println("Total Water Bill: Rs. " + totalWaterBill);

        scanner.close(); // Close the scanner
    }
}
