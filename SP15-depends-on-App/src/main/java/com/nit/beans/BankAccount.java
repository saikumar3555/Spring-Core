package com.nit.beans;

public class BankAccount {
	
	private String name;
	private Long aadharNo;
	private Long mobileNo;
	//private PanDetails panDetails;
	public BankAccount(String name, Long aadharNo, Long mobileNo) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
		System.out.println("bank account created");
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", aadharNo=" + aadharNo + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
	


	