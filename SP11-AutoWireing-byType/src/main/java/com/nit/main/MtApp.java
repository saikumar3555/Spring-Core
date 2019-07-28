package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Person;

public class MtApp {

	public static void main(String[] args) {

ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/cfgs/beans.xml");
Person p=context.getBean("person",Person.class);
System.out.println(p);
	}

}
