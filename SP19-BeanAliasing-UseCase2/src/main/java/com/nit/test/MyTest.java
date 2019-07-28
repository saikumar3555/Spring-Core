package com.nit.test;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.NewReportGenerator;
import com.nit.beans.ReportGeneratorService;

public class MyTest {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/cfgs/beans.xml");
		NewReportGenerator rs=context.getBean("newRepoGen",NewReportGenerator.class);
		rs.generate();
	}

}
