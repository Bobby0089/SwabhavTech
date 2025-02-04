package com.company;

import java.util.*;

public class QuickCash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to QuickCash please enter the amount you want to withdrawal : ");
		System.out.println("Available currency are Rs2000, RS500, Rs200 and rs100");
		int amount = sc.nextInt();
		
		
		if(amount <= 50000) {
			if(amount % 100 != 0) {
				System.out.println("Amount should be in multiples of Rs 100");
				return;
			}
			
		System.out.println(amount);
		System.out.println();
		
		int temp = amount;
		while(amount>0) {
			amount %= 2000;
			int a = temp / 2000;
			if(a != 0)
				System.out.println("Two Thousand : "+ a);
			
			temp = amount;
			amount %= 500;
			int b = temp/500;
			if(b != 0) 
				System.out.println("five hundred : "+ b);
			
			temp = amount;
			amount %= 200;
			int c = temp/200;
			if(c != 0)
				System.out.println("two hundred : "+ c);
			
			temp = amount;
			amount %= 100;
			int d = temp/100;
			if(d != 0)System.out.println("one hundred : "+ d);
		    }				
	        } 
		    else {
		    	System.out.println("Amount exceeds withdrawal limit of Rs 50000. ");
		    }

	}
}
