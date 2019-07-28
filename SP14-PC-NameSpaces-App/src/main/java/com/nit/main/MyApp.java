package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Address;
import com.nit.beans.Contact;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("com/nit/cfgs/beans.xml");
		
		Contact ct=ctxt.getBean("contact",Contact.class);
		System.out.println(ct);
		Address ad=ctxt.getBean("address",Address.class);
		System.out.println(ad);
				
	}

}
