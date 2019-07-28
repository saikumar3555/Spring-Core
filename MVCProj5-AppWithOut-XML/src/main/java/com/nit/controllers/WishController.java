package com.nit.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.service.GreetService;


@Controller
public class WishController {
	@Autowired(required=true)
	private GreetService service;
	
	public WishController() {
	System.out.println("WishController.WishController()");
	}

	
	@RequestMapping("/greet.action")
	public String greet(Model model) {
		String result=service.getGreeting();
		model.addAttribute("msg", result);
		return "greet";
	}

	
	
}
