package com.house.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Register 

{
@Id
@GeneratedValue
@Column(columnDefinition="integer(25)")
private int userid;
public int getUserid() {
	return userid;
}


public void setUserid(int userid) {
	this.userid = userid;
}


@Column(columnDefinition="varchar(30)" )
private String username;

@Column(columnDefinition="long(10)")
long mobno;

@Column(columnDefinition="varchar(50)")
String email;


@Column(columnDefinition="varchar(50)")
String addrs;


@Column(columnDefinition="varchar(50)")
String password;

@Column(columnDefinition="varchar(50)")
String confirmpassword;
public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public long getMobno() {
	return mobno;
}


public void setMobno(long mobno) {
	this.mobno = mobno;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getAddrs() {
	return addrs;
}


public void setAddrs(String addrs) {
	this.addrs = addrs;
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

