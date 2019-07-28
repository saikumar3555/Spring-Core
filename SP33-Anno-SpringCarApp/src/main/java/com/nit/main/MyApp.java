package com.nit.main;
import com.nit.beans.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp { 
	public static void main(String[] args) {
		
		
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("com/nit/cfgs/beans.xml");
	      Car c=ctxt.getBean("car",Car.class);
	
	
	c.drive();
				
	}

}
