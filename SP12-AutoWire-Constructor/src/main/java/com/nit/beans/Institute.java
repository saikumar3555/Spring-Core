package com.nit.beans;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Institute {
	
	private int instituteId;
	private String instituteName;
	private Set<String> buildings;
	private List<String> faculty;
	private Set<String> branches;
	private Course course;
	
	
	public Institute(int instituteId, String instituteName, Set<String> buildings, List<String> faculty,
			Set<String> branches, Course course) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.buildings = buildings;
		this.faculty = faculty;
		this.branches = branches;
		this.course = course;
	}


	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", buildings=" + buildings
				+ ", faculty=" + faculty + ", branches=" + branches + ", course=" + course + "]";
	}
	
	
	

	

}
