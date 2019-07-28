package com.nt.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.DateService;

@Controller
public class DateController {
	public DateController() {
		System.out.println("DateController.DateController()");
	}
	@Autowired
	private DateService dateService;
	
	 @RequestMapping(value="/date.htm")
	public String displayDate(Model model) {
		Date d=dateService.getTodayDate();
		model.addAttribute("date", d);
		
		return "index";
	}

}
