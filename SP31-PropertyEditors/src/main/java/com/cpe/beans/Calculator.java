package com.cpe.beans;

import lombok.Setter;

public class Calculator {
	@Setter
	private Number an;
	
	public void sum() {
		
		int sum=an.getI()+an.getJ();
		System.out.println(sum);
	}

}
