package com.nit.beans;



public class Course {
	
	private int courseId;
	private String courseName;
	private Double courseFee;
	
	public Course(int courseId, String courseName, Double courseFee) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	

}
