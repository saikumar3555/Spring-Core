package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.BankAccount;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/beans.xml");
		BankAccount bc=ctx.getBean("bankAccount",BankAccount.class);
		System.out.println(bc);
	}

}
