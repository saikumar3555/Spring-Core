package com.java8.features;


interface IWelcome{
	//public void printWelcomeMsg();
	
	//public void printWelcomeMsg(String name);
	public String printWelcomeMsg(String name);
}
public class WelcomeApp {

	public static void main(String[] args) {
		/*IWelcome w=()->{
			System.out.println("Hello welcome to codeing");
		};
		w.printWelcomeMsg();*/
		
		/*
		IWelcome w2=(name)->{
			System.out.println("Hello welcomw to codeing :: "+name);
		};
		w2.printWelcomeMsg("saikumar apa");*/
		
		IWelcome w3=(name)->{
			return "Hello Welcome to codeing :: "+name;
		};
		String result=w3.printWelcomeMsg("Saikumar duvva apa");
		System.out.println(result);

	}//main

}//class
