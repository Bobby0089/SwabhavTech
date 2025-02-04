package com.company;

import java.util.Scanner;

public class DrivingBill {

	public static void main(String[] args) {
		// Create a Scanner 
		Scanner sc = new Scanner(System.in);
		
		
		int TotalBill = 0;

		// Ask user for their height
		System.out.println("Lets begin!");
		System.out.println("What is your height?");
		int userHeight = sc.nextInt();
		
		// Check if the user is tall enough to ride
		if (userHeight > 120)
		{
			System.out.println("You can ride!");
			
			// Ask user for their age
			System.out.println("What is your age?");
			int userAge = sc.nextInt();
			
			// Determine the price based on the age
			if (userAge < 12)
			{
				TotalBill += 5; 
			}
			else if (userAge >= 12 && userAge <= 18)
			{
				TotalBill += 7; 
			}
			else if (userAge > 18 && !(userAge >= 45 && userAge <= 55))
			{
				TotalBill += 12;
			} 
			
		}
		else
		{
			
			System.out.println("Sorry, you can't ride.");
		}
		
		// Ask if the user wants photos
		System.out.println("Do you want photos (yes/no)?");
		String userReply = sc.next();
		
		// Add the photo charge if user agrees
		if (userReply.equalsIgnoreCase("yes"))
		{
			TotalBill += 3; 
		}
		
		
		System.out.println("Final bill amount = " + TotalBill);
		
		// Close the scanner
		sc.close();
	}
}
