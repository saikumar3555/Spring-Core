package com.dt.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class M1_Param_MethodReplacer implements MethodReplacer {

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		/*System.out.println(obj.getClass().getName());
		System.out.println(method.getName());
		System.out.println(Arrays.toString(args));*/
		
		System.out.println(" re impimented m1(String a , String b) method...");
		
		return null;
	}

}
