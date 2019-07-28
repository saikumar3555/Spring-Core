package com.paradise.beans;

public class CreditCardPayment implements IPayment {
	public CreditCardPayment() {
		System.out.println("CreditCardPayment::constructor");
	}

	public boolean process(double amt) {
		System.out.println("CreditCardPayment process");
		return true;
	}

}
