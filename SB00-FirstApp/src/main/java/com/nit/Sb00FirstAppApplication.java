package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sb00FirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Sb00FirstAppApplication.class, args);
		Alien a=context.getBean(Alien.class);
		Laptop l=context.getBean(Laptop.class);
		l.compile();
		//Alien a =new Alien();
		a.display();
		a.display();
	}

}
