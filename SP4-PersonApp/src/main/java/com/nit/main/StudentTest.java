package com.nit.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.beans.Player;
import com.nit.beans.Student;

public class StudentTest {

	public static void main(String[] args) {
		//to load xml file
		Resource res=new ClassPathResource("com/nit/cfgs/beans.xml");
		//to start ioc conatainer
		BeanFactory factory=new XmlBeanFactory(res);
		//to get object
		//Student s=factory.getBean("student",Student.class);
		//System.out.println(s);
		
		Player p=factory.getBean("player",Player.class);
		System.out.println(p);

	}

}
