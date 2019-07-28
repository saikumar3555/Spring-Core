package com.apa.beans;

import java.util.Date;

public class PrintMsg {
	
	private String name;
	private Date lastModifiedDate;
	
	
	public void init() {
	  System.out.println("PrintMsg::init()");
	}
	
	public void destroy() {
		System.out.println("PrintMsg::destroy()");
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public String toString() {
		return "PrintMsg [name=" + name + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
	

}//class
