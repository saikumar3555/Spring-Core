package com.nit.beans;

import java.util.Set;

public class Institute {
	
	private int instituteId;
	private String instituteName;
	private Set<String> buildings;
	private Set<String> faculty;
	private Set<String> branches;
	private Course course;
	
	
	
	
	
public Institute() {
	
}

	public Institute(int instituteId, String instituteName, Set<String> buildings, Set<String> faculty,
			Set<String> branches, Course course) {
		
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.buildings = buildings;
		this.faculty = faculty;
		this.branches = branches;
		this.course = course;
	}





	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}





	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}





	public void setBuildings(Set<String> buildings) {
		this.buildings = buildings;
	}





	public void setFaculty(Set<String> faculty) {
		this.faculty = faculty;
	}





	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}





	public void setCourse(Course course) {
		this.course = course;
	}





	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", buildings=" + buildings
				+ ", faculty=" + faculty + ", branches=" + branches + ", course=" + course + "]";
	}
	
	
	

	

}
