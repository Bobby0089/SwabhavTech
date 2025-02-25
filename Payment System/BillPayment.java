package com.company.test;

import java.util.Scanner;

import com.company.payment.CreditCardPayment;
import com.company.payment.DebitCardPayment;
import com.company.payment.UpiPayment;

public class BillPayment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pendingAmount;
		
		
		while(true)
		{
			System.out.println("Enter the amount you have to pay: ");
			pendingAmount = sc.nextInt();
			
			if(pendingAmount < 0 ) {
				System.out.println("Enter valid amount: ");
			}
			else {
				break;
			}
		}
		
		System.out.println("Available payment method : ");
		System.out.println("1.Credit Card (10% charge): ");
		System.out.println("2.Debit card (5% charge): ");
		System.out.println("3.upi (3% charge): ");
		
		int choice;
		
		boolean flag = false;
		
		while(!flag)
		{
			System.out.println("Enter your choice : ");
		    choice = sc.nextInt();
		    
			switch(choice)
			{
			case 1 : CreditCardPayment creditCard = new CreditCardPayment();
					 System.out.println("total amount payable is : Rs"+creditCard.processPayment(pendingAmount));
					 System.out.println("Paid using credit card !! ");
					 flag = true;
					 break;
					 
			case 2 : DebitCardPayment debitCard = new DebitCardPayment();
					 System.out.println("total amount payable is : Rs"+debitCard.processPayment(pendingAmount));
					 System.out.println("Paid using debit card !! ");
					 flag = true;
					 break;
			 
			case 3 : UpiPayment upi = new UpiPayment();
			         System.out.println("total amount payable is : Rs"+upi.processPayment(pendingAmount));
			         System.out.println("Paid using upi !! ");
			         flag = true;
			         break;
			         
			default : System.out.println("Please enter a valid choice !! ");
			          
			}
			if(flag)
			{
				break;
			}
		}
		
		sc.close();
	}

}
