package com.nit.car;

public class EngineFactory {

	public static IEngine createEngine(String fuelType) {
		if(fuelType.equalsIgnoreCase("Petrol")) {
			PetrolEngine pe=new PetrolEngine();
			
			return pe;
		}else if(fuelType.equalsIgnoreCase("Diesel")) {
			DieselEngine de =new DieselEngine();
			
			return de;
		}else {
		return null;}
	} 
}
