package com.tata.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tata.beans.Car;

public class CarTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("com/tata/cfgs/beans.xml");
		Car c=context.getBean("car",Car.class);
	      c.doWork();
	      context.registerShutdownHook();
		
	}

}
