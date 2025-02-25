package com.company.payment;

public class UpiPayment implements IPayment {

	@Override 
	public  double processPayment(double amount) {
		
		return amount = amount + amount*3.0/100;
	}
}
