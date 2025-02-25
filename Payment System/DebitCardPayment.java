package com.company.payment;

public class DebitCardPayment implements IPayment{

	@Override 
	public double processPayment(double amount) {
		
		return amount = amount + amount*5.0/100;
	}
}
