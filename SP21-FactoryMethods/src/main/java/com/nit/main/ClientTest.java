package com.nit.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/nit/cfgs/beans.xml");
	DateUtils dt=context.getBean("dateUtils",DateUtils.class);
	
	dt.toGetNoOfDays(new Date(), 2);

	}

}
