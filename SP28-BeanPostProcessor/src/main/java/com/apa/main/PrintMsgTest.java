package com.apa.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.apa.beans.MyBeanProcessor;
import com.apa.beans.PrintMsg;

public class PrintMsgTest {

	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("com/apa/cfgs/beans.xml");
		AbstractBeanFactory factory=new XmlBeanFactory(res);
		//the BeanFactory will not Scanning the BeanPostProcessor so we have to create object for that BeanPostProcessor implemrnted class
		//and we have to inject into factory by calling addPostProcessor()method
		MyBeanProcessor bpp=new MyBeanProcessor();
		((AbstractBeanFactory) factory).addBeanPostProcessor(bpp);
		
		
		PrintMsg pm=factory.getBean("pm",PrintMsg.class);
		System.out.println(pm);
		((DefaultListableBeanFactory) factory).destroySingletons();
		
		
		
     /* ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("com/apa/cfgs/beans.xml");
      PrintMsg pm=context.getBean("pm",PrintMsg.class);
      System.out.println(pm); 
      
      //this is for to call destroy method
      context.registerShutdownHook();*/
      
	}//main

}//class
