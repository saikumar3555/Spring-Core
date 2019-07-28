package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Rocket;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Rocket rc=ctx.getBean("rocket",Rocket.class);
		System.out.println(rc);

	}

}
