package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WishController {

	
	@RequestMapping(value="/showRegForm.htm")
	public ModelAndView wishMsg() {
		String msg="HEllo Spring";
		ModelAndView mav=new ModelAndView("result","msg",msg);
		return mav;
		
	}
}
