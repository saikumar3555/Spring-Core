package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> fetchAllEmployees() {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=null;
		EmployeeDTO dto=null;
		//use DAO
		listBO=dao.getAllEmployees();
		//copy listBO to listDTO
		listDTO=new ArrayList();
		for(EmployeeBO bo:listBO) {
			 dto=new EmployeeDTO();
			 BeanUtils.copyProperties(bo, dto);
			 dto.setSno(listDTO.size()+1);
			 listDTO.add(dto);
		}
		
		return listDTO;
	}//method
}//class
