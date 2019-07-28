package com.dt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dt.beans.ReportGenerator;

public class MethodReplacementTest {

	public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("com/dt/cfgs/beans.xml");
    ReportGenerator rg=context.getBean("reportGenerator",ReportGenerator.class);
    
    
   // rg.m1();
    rg.m1("a","b");
    
   
    
    
	}//main

}//class
