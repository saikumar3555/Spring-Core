package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {

	public int start() {
		System.out.println("Diesel_Engine is started");
		return 0;
	}

}
