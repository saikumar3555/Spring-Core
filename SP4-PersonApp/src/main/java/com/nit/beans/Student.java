package com.nit.beans;

public class Student {
	
	private int studentId;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

	private String studentName;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	private int studentAge;

}
