package com.nit.beans;

public class Contact {
	
	private int id;
	private String name;
	private String gmail;
	private Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", gmail=" + gmail + ", address=" + address + "]";
	}
	
	

}
