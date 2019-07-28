package com.nit.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.service.DateService;

@Controller
public class WishController {
	private DateService service;
	
	 public WishController() {
	System.out.println("WishController.WishController()");
	}

	@RequestMapping(value = "/wishIndex.action")
	public String userWish(Model model) {
		model.addAttribute("msg", "Hello GudMorning");
		return "wishIndex";
	}
	
	@RequestMapping(value="/greet.action")
	public String greetUser(Model model) {
		model.addAttribute("msg","Hello user");
		return "wishIndex";
	}

	
	@RequestMapping(value="/date.action")
	public String displayDate(Model model) {
		Date d=service.getTodayDate();
		model.addAttribute("Date", d);
		return "date";
	}
}
