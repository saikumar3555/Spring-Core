package com.nit.main;
import com.nit.beans.Car;
import com.nit.beans.IEngine;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp { 
	public static void main(String[] args) {
		
		Resource resource =new ClassPathResource("com/nit/cfgs/beans.xml");
		
		BeanFactory factory=new XmlBeanFactory(resource);
	Object obj=(Car)factory.getBean("car");
	
	Car c=(Car)obj;
	c.drive();
				
	}

}
