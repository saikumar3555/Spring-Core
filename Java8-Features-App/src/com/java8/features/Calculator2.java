package com.java8.features;


interface ICalculator2{
	public int add(int a,int b);
}

//using ananimous inner class
public class Calculator2 {

	public static void main(String[] args) {
		ICalculator2 c=new ICalculator2() {
			
			@Override
			public int add(int a, int b) {
				
				return a+b;
			}
		};
		
		System.out.println(c.add(10, 30));

	}//main

}//class
