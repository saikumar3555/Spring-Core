package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.model.User;

@Controller
public class UserController {
	 public UserController() {
		 System.out.println("UserController.UserController()");
	 }
	@RequestMapping(value="/userReg.htm", method=RequestMethod.POST)
	public String userRegistration(@ModelAttribute("user")User user,Model model,RedirectAttributes attributes) {
		
		attributes.addFlashAttribute("msg", "User Registration Successful...................");
		System.out.println("user: "+user);
		model.addAttribute("msg", "User Registration Successful...................");
		return "redirect:/regSuccessful.htm";
	}
	
	@RequestMapping(value="/userForm.htm")
	public String displayForm(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "regForm";
	}
	
	
	@RequestMapping(value="/regSuccessful.htm",method=RequestMethod.GET)
	public String regSuccess(Model model) {
		model.addAttribute("user", new User());
		return "regForm";
	}

}
