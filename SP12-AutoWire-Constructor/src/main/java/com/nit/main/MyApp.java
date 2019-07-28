package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Institute;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/cfgs/beans.xml");
		Institute ins=context.getBean("inst",Institute.class);
		System.out.println(ins);

	}

}
