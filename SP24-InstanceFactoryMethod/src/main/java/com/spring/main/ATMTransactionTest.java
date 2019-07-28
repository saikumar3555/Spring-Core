package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.ATMTransaction;

public class ATMTransactionTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/cfgs/beans.xml");
		ATMTransaction test=context.getBean("atm",ATMTransaction.class);
		test.withdraw();
	}

}
