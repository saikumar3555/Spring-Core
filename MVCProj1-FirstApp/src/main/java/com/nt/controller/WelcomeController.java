package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.mvc.AbstractController;

public class WelcomeController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		//create ModelAndView Object
		ModelAndView mav=new ModelAndView();
		
		//Add data to Model Object
		mav.addObject("msg", "Welcome to Spring By APA");
		//set View Name
		mav.setViewName("welcome");
		
		return mav;
	}

	
}
