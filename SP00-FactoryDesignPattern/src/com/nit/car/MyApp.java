package com.nit.car;

public class MyApp {
	public static void main(String[] args) throws Exception {
		int engineStatus = 0;
		IEngine eng;
		eng = EngineFactory.createEngine("gas");
		Car c = new Car();
		c.drive();
		if (eng != null) {
			eng.start();
		} else {
			throw new Exception("sutaible Engine is not found");
		}

		if (engineStatus == 0) {
			System.out.println("Engine is not Started");
		} else if (engineStatus == 1) {
			System.out.println("Engine is Started");
		} else {
			System.out.println("Contact Mechanic");
		}
	}

}
