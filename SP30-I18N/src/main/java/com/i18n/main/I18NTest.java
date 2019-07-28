package com.i18n.main;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NTest {

	public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("com/i18n/cfgs/beans.xml");
    
    Locale l=new Locale("zh","CN");
    String s=context.getMessage("hello", new Object[] {"Ashok"}, l);
    System.out.println(s);
	}

}
