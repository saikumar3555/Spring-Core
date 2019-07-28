package com.maruthi.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
	private int carId;
	private String carName;
	private Double carPrice;
	private String colour;
	private String carRegistration;

}
