package com.tata.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tata.beans.Motor;

public class Test {
	public static void main(String[] args) {
	
	//ApplicationContext context=new ClassPathXmlApplicationContext("com/tata/cfgs/beans.xml");
    
	//below ConfigurableApplicationContext required to call registerShutdownHook() for calling the destroy method
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("com/tata/cfgs/beans.xml");
	
	Motor m=context.getBean("motor",Motor.class);
	m.doingWork();
	//context.close();
	context.registerShutdownHook();
    
	}

}
