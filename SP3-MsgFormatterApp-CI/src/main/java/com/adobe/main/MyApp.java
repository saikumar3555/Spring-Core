package com.adobe.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.adobe.beans.MessageWriter;

public class MyApp {

	public static void main(String[] args) {
		//System.out.println("main() started");
		//Loadind xml file
		Resource res=new ClassPathResource("com/adobe/cfgs/beans.xml");
		//start the ioc container
		BeanFactory factory=new XmlBeanFactory(res);
		MessageWriter mw=factory.getBean("msgWriter",MessageWriter.class);
	String rres=mw.writeMsg("Hello Apa How r u ?");
		System.out.println(rres);

	}//main

}//class

