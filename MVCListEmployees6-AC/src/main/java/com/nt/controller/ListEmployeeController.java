package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class ListEmployeeController extends AbstractController {
	private  EmployeeService service;

	public ListEmployeeController(EmployeeService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List<EmployeeDTO>  listDTO=null;
		ModelAndView mav=null;
		//use Service
		listDTO=service.fetchAllEmployees();
		//keep listDTO obj in MAV object
		mav=new ModelAndView("show_emps", "emp_list",listDTO);
	   return mav;	
	
	}

}
