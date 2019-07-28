package com.bfpp.beans;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class ConnectionManager {
	private String url;
	private String userName;
	private String password;
	private String driverClass;
	

}
