package com.axis.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.axis.beans.CacheManager1;

public class EmiCaluclatorTest {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/axis/cfgs/beans.xml");
CacheManager1 em=context.getBean("cm",CacheManager1.class);

	}

}
