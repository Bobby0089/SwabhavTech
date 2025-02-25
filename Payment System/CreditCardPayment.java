package com.company.payment;

public class CreditCardPayment implements IPayment{

	@Override 
	public double processPayment(double amount) {
		
		return amount +=amount*10.0/100;
	}
}
