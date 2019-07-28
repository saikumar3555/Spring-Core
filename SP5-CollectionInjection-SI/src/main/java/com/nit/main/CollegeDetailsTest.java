package com.nit.main;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.beans.CollegeDetails;

public class CollegeDetailsTest {

	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("com/nit/cfgs/beans.xml");
		BeanFactory factory =new XmlBeanFactory(res);
		CollegeDetails details=factory.getBean("collegeDetails",CollegeDetails.class);
		//System.out.println(details.getCollegeBranches());
		System.out.println(details);
		
		
		
		for(String s:details.getCollegeBranches()) {
			System.out.println(s);
		}

	}

}
