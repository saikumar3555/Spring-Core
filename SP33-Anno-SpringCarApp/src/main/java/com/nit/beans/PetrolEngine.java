package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine {

	public int start() {
		System.out.println("Petrol_Engine started");
		return 0;
	}

}
