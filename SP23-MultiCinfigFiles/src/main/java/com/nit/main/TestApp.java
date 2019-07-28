package com.nit.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.controller.Car;

public class TestApp {
	
	public static void main(String[] args) {
		/*ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/cfgs/controller-beans.xml","com/nit/cfgs/service-beans.xml");
		
		Car c=context.getBean("car",Car.class);
		c.drive();
		System.out.println("Car moving..");*/
		
		
		/*
		 * this concept is Nested beans 
		 * if we want configiure multiple configuration files in BeanFactory 
		 * we have to use  2 containers parent and child container
		 * 
		 * the dependent beans avilable BeanFactory take as a parent container
		 * the target beans avilable BeanFactory takes as a child container
		 * 
		 * 
		 */
		Resource controllerRes=new ClassPathResource("com/nit/cfgs/controller-beans.xml");
		Resource serviceRes=new ClassPathResource("com/nit/cfgs/service-beans.xml"); 
		
		BeanFactory parentfactory2=new XmlBeanFactory(serviceRes);
		BeanFactory childfactory1=new XmlBeanFactory(controllerRes,parentfactory2);
		
		Car c=childfactory1.getBean("car",Car.class);
		c.drive();
		System.out.println("Car moving..");
		
	}//main

}//class
