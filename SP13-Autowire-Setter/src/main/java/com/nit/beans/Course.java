package com.nit.beans;




public class Course {
	
	private int courseId;
	private String courseName;
	private Double courseFee;
	
public Course() {
	
}
	
	
	public Course(int courseId, String courseName, Double courseFee) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	

}
