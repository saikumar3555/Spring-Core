package com.nit.beans;

public class Person {
	
	private int personId;
	private String personName;
	private String personGmail;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonGmail() {
		return personGmail;
	}
	
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personGmail=" + personGmail
				+ ", permanentAddress=" + permanentAddress + ", presentAddress=" + presentAddress + "]";
	}
	public void setPersonGmail(String personGmail) {
		this.personGmail = personGmail;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Address getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}
	private Address permanentAddress;
	private Address presentAddress;

}
