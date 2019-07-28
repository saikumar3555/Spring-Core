package com.java8.features;

@FunctionalInterface
interface ICalculator3{
	public int add(int a,int b);
}

//implementation using lambda expression
public class Calculator3 {
	public static void main(String[] args) {
		ICalculator3 c=(a,b)->{
			return a+b;
			};
			int sum=c.add(13 ,20);
			System.out.println(sum);
		
	}

}
