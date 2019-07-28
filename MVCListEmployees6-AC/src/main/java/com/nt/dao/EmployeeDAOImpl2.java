package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl2 implements EmployeeDAO {
	private static final String  GET_ALL_EMPLOYEES="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";
	private JdbcTemplate jt;

	public EmployeeDAOImpl2(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<EmployeeBO> getAllEmployees() {
		List<EmployeeBO> listBO1=null;
		listBO1=jt.query(GET_ALL_EMPLOYEES, rs->{
				List<EmployeeBO> listBO=null;
				EmployeeBO  bo=null;
				listBO=new ArrayList();
				while(rs.next()) {
					//copy each record of ResultSet obj to  BO class obj
					bo=new EmployeeBO();
					bo.setEmpNo(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setJob(rs.getString(3));
					bo.setSalary(rs.getFloat(4));
					bo.setDeptNo(rs.getInt(5));
					//add BO class obj to ListBO
					listBO.add(bo);
			}//while
				return listBO;
		});
		return listBO1;
	}//method
}//class
