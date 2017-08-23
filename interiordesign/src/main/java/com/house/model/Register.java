package com.house.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Register {
	@Id
	@GeneratedValue
	@Column
	private int userid;
	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	@Column
	private String name;

	@Column
	long mobile;

	@Column
	String email;


	

	@Column
	String password;

	@Column
	String confirmpassword;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmpassword() {
		return confirmpassword;
	}


	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}


	
	
	
}