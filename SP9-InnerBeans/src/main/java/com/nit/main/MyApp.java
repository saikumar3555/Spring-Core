package com.nit.main;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Robot;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/cfgs/beans.xml");
		Robot robot=context.getBean("robot",Robot.class);
	System.out.println(robot);
		

	}

}
