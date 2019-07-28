package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl3 implements EmployeeDAO {
	private static final String  GET_ALL_EMPLOYEES="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";
	private JdbcTemplate jt;

	public EmployeeDAOImpl3(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<EmployeeBO> getAllEmployees() {
		BeanPropertyRowMapper<EmployeeBO>  bprm=null;
		List<EmployeeBO>  listBO=null;
		
		bprm=new BeanPropertyRowMapper<EmployeeBO>(EmployeeBO.class);
		listBO=(List<EmployeeBO>) jt.query(GET_ALL_EMPLOYEES,new RowMapperResultSetExtractor(bprm));
		
		return listBO;
		
			
			}//method
}//class
