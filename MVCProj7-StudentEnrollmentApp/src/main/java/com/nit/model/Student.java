package com.nit.model;

import lombok.Data;

@Data
public class Student {
	private Integer sid;
	private String name;
	private Long phno;
	private String gender;
	private String[] qualification;
	private String[] courses;
	private String[] timings;

}
