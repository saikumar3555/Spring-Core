package com.maruthi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maruthi.beans.Car;

public class MyApp {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/maruthi/cfgs/beans.xml");
	Car c1=context.getBean("c1",Car.class);
	System.out.println(c1);
	
	Car c2=context.getBean("c2",Car.class);
	System.out.println(c2);
}
}
