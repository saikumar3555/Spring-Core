package com.apa.beans;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor {
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		/*if(bean instanceof PrintMsg) {
			((PrintMsg) bean).setLastModifiedDate(new Date());
		}*/

		System.out.println("MyBeanProcessor.postProcessAfterInitialization()");
		return  bean;
	}
  
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanProcessor.postProcessBeforeInitialization()");
        if(bean instanceof PrintMsg) {
			((PrintMsg) bean).setLastModifiedDate(new Date());
		}
		return bean;
	}
}
