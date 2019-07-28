package com.nit.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.model.Student;

@Controller 
public class StudentEnrollmentController {
	public StudentEnrollmentController() {
		System.out.println("StudentEnrollmentController.StudentEnrollmentController()");
	}
	
	/**
	 * This method is to display student registration form
	 * @return
	 */
    @RequestMapping(value= {"/enrollStudent.htm","/.htm"})
	public String loadStudentEnrollForm(Model model) {
    	List<String> qualifications=new ArrayList();
    	//Map<String,String> qualifications=new HashMap<String,String>();
    	//qualifications.put("PG","PG");
    	     qualifications.add("PG");
    	model.addAttribute("qul", qualifications);
		Student student=new Student();
		model.addAttribute("student", student);
		return "enrollForm";
	}
	
	/**
	 * this method is to submit student enrollment data to server
	 * @return
	 */
    @RequestMapping(value="/enrollStudent.htm",method=RequestMethod.POST)
	public String regStudentEnrollForm(@ModelAttribute("student")Student s,Model model,RedirectAttributes attributes) {
    	System.out.println(s);
    	attributes.addFlashAttribute("enrollSuccessMsg", "Student Registration Successful.....................");
		//model.addAttribute("enrollSuccessMsg", "Student Registration Successful.....................");
		return "redirect:/.htm";
	}

}//class
