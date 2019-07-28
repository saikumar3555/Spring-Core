package com.paradise.beans;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment::constructor");
	}

	public boolean process(double amt) {
		System.out.println("DebitCardPayment process");
		return true;
	}

}
