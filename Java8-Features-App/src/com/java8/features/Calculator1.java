package com.java8.features;


 interface Icalculator{
	
	public int add(int a, int b);
}
 
 //First Approch implimentation
public class Calculator1 implements Icalculator {
	
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
	

	public static void main(String[] args) {
		Icalculator c=new Calculator1();
		int result=c.add(10,20);
		System.out.println(result);
	

	}

	

}
