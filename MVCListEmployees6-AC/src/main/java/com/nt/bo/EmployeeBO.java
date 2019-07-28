package com.nt.bo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeBO {
	private int empNo;
	private String ename;
	private  String job;
	private float salary;
	private  int deptNo;

}
