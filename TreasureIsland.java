package com.company;

import java.util.*;

public class TreasureIsland {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome to the Treasure Island");
		
		
		System.out.print("Enter Left or Right : ");
		String leftRight = sc.next();
		
		// If user chooses 'left'
		if(leftRight.equalsIgnoreCase("left"))
		{
			
			System.out.print("Enter Swim or Wait : ");
			String swimWait = sc.next();
			
			// If user chooses 'wait'
			if(swimWait.equalsIgnoreCase("wait"))
			{
				
				System.out.print("Which door Red, Blue or Yellow : ");
				String door = sc.next();
				
				
			    if(door.equalsIgnoreCase("yellow"))
			    {
			    	System.out.println("Congratulations You Win!! ");
			    }
			   
			    else if(door.equalsIgnoreCase("red"))
			    {
			    	System.out.println("Burned by fire ");
			    	System.out.println("Game over!! ");
			    }
			   
			    else if(door.equalsIgnoreCase("blue"))
			    {
			    	System.out.println("Eaten by beasts. ");
			    	System.out.println("Game over!! ");				
			    }  
			    else
			    {
			    	System.out.println("Game over!!");
			    }
			}
			else
			{		
				System.out.println("Game over!! ");
			}		
		}
		else
		{
			System.out.println("Game over!! ");
		}
			
		// Close the scanner
		sc.close();
	}
}
