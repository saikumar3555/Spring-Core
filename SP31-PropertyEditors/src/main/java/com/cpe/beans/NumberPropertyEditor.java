package com.cpe.beans;

import java.beans.PropertyEditorSupport;

public class NumberPropertyEditor extends PropertyEditorSupport {
	public void setAsText(String val)throws IllegalArgumentException{
		if(val!=null) {
			String[] arr=val.split(",");
			   int i=Integer.parseInt(arr[0]);
			   int j=Integer.parseInt(arr[1]);
			   Number num=new Number();
			   num.setI(i);
			   num.setJ(j);
			   setValue(num);
		}
	}

}
