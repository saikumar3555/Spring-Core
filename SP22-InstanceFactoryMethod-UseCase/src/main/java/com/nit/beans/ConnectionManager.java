package com.nit.beans;

import javax.sql.DataSource;

public class ConnectionManager {
	
	private DataSource dataSource=null;
	public void getConnection() {
		System.out.println("con establishes..");
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
