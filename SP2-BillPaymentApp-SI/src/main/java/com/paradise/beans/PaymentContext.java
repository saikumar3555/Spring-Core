package com.paradise.beans;

public class PaymentContext {
	private IPayment payment=null;
	public void setPayment(IPayment payment) {
		this.payment=payment;
	}
	
	public void myPayment(double amt) {
		boolean paymentStatus=payment.process(amt);
		System.out.println("payment successful ? "+paymentStatus);
	}

}
