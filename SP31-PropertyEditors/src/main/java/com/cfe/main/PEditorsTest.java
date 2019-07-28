package com.cfe.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpe.beans.Calculator;

public class PEditorsTest {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/cpe/cfgs/beans.xml");
		
		Calculator c=context.getBean("cal",Calculator.class);
		c.sum();
	}

}
