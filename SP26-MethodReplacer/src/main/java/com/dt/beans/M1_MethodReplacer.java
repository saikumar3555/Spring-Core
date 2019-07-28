package com.dt.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class M1_MethodReplacer implements MethodReplacer {

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("re-implemented m1() method...");
		
		
		return null;
	}

}
