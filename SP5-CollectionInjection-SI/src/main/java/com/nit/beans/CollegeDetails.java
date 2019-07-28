package com.nit.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.xml.internal.fastinfoset.sax.Properties;

import lombok.Data;

@Data
public class CollegeDetails {
	private int collegeId;
	private String collegeName;
	private Set<String> collegeBranches;
	private List<String> collegeFaculty;
	private Map<Integer,String> studentInfo;
	private java.util.Properties emails;
	
	

}
