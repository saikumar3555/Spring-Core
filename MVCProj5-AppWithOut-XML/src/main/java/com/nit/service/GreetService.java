package com.nit.service;


import org.springframework.stereotype.Service;

@Service
public class GreetService {
	
	public  String getGreeting() {
		return "Good Morning";
	}

}
