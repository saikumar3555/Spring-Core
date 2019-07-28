package com.tcs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.beans.Meeting;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext contect=new ClassPathXmlApplicationContext("com/tcs/cfgs/beans.xml");
		Meeting mt=contect.getBean("prgMeeting",Meeting.class);
		System.out.println(mt);
		
		Meeting mt2=contect.getBean("scrMeeting",Meeting.class);
		System.out.println(mt2);

		
	}

}
