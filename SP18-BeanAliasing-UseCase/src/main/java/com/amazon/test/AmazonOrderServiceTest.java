package com.amazon.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.beans.Address;
import com.amazon.beans.AmazonOrderService;
import com.amazon.beans.Order;

public class AmazonOrderServiceTest {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/amazon/cfgs/beans.xml");
		
		//Helper bean1
		Order o=context.getBean("order",Order.class);
		//Helper Bean2
		Address ad=context.getBean("address",Address.class);
		
		//Target class
        AmazonOrderService test=context.getBean("aos",AmazonOrderService.class);
        test.placeOrder(o,ad);
		
	}

}
