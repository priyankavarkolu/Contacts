package com.agilecrm.model;



public class Contact {


	private int id;
	private  String fname;
	private String lname;
	private String email;
	private String createdBy;
	private String createdDate;
	private String address;
	private String dob;
	private boolean isActive;
	private String updatedBy;
	private String updatedDate;
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", address=" + address + ", dob=" + dob + ", isActive="
				+ isActive + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + ", getId()=" + getId()
				+ ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getEmail()=" + getEmail()
				+ ", getCreatedBy()=" + getCreatedBy() + ", getCreatedDate()=" + getCreatedDate() + ", getAddress()="
				+ getAddress() + ", getDob()=" + getDob() + ", getIsActive()=" + getIsActive() + ", getUpdatedBy()="
				+ getUpdatedBy() + ", getUpdatedDate()=" + getUpdatedDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public Contact(int id, String fname, String lname, String email, String createdBy, String createdDate,
			String address, String dob, boolean isActive, String updatedBy, String updatedDate) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.address = address;
		this.dob = dob;
		this.isActive = isActive;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id =id;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname =fname;
	}
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname =lname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email =email;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public String getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}


	
	
	
}
