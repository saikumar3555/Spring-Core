package com.tata.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean,DisposableBean {
	
	
	
	
	public void doingWork() {
		System.out.println("Motor Running...");
	}
     
	
	public void afterPropertiesSet() throws Exception {
      System.out.println("Motor started...");		
	}

	public void destroy() throws Exception {
      System.out.println("Motor stopped...");		
	}

}
