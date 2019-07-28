package com.bfpp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bfpp.beans.ConnectionManager;
import com.bfpp.beans.EmailService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bfpp/cfgs/beans.xml");
		ConnectionManager cm=context.getBean("cm",ConnectionManager.class);
		System.out.println(cm);
		
		EmailService es=context.getBean("es",EmailService.class);
		System.out.println(es);
		
		
	}
}
