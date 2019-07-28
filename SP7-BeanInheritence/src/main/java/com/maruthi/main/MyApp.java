package com.maruthi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maruthi.beans.Car;

public class MyApp {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/maruthi/cfgs/beans.xml");
	Car car=context.getBean("car",Car.class);
	System.out.println(car);
	
	
}
}
