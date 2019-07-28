package com.airtel.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airtel.beans.Token;
import com.airtel.beans.TokenGenerator;

public class LookUpTestApp {
	
	public static void main(String[] args) {
		   /*ApplicationContext context=new ClassPathXmlApplicationContext("com/airtel/cfgs/beans.xml");
		 TokenGenerator tg= context.getBean("tg",TokenGenerator.class);
		  TokenGenerator tg2= context.getBean("tg",TokenGenerator.class);
		  tg.getToken();
		  tg2.getToken();
		 System.out.println( tg.hashCode());
		 System.out.println( tg2.hashCode());*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/airtel/cfgs/beans.xml");
		 TokenGenerator tg= context.getBean("tg",TokenGenerator.class);
		 Token t1=tg.getToken();
		 Token t2=tg.getToken();
		 System.out.println(t1+"   "+t2);
		 
		 System.out.println(tg.getClass().getName());
		System.out.println(tg.getToken().hashCode()); 
		System.out.println(tg.getToken().hashCode()); 
		
		
		
		
	}//main

}//class
