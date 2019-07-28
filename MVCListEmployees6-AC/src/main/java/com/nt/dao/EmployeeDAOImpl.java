package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String  GET_ALL_EMPLOYEES="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";
	private JdbcTemplate jt;

	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<EmployeeBO> getAllEmployees() {
		List<EmployeeBO> listBO=null;
		listBO=jt.query(GET_ALL_EMPLOYEES, new  EmployeeExtractor());
		return listBO;
	}
	
	private  class EmployeeExtractor implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
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
			}
			return listBO;
		}
		
	}

}
