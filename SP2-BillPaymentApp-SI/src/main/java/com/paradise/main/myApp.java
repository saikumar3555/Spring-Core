package com.paradise.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.paradise.beans.PaymentContext;

public class myApp {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("com/paradise/cfg/beans.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		PaymentContext pc=factory.getBean("paymentCtx",PaymentContext.class);
		pc.myPayment(1299.00);

	}

}
