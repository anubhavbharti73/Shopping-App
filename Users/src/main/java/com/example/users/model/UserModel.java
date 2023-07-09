package com.example.users.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class UserModel {
	
	@Id
	String emailid;
	String name;
	String password;
	String phoneno;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "UserModel [emailid=" + emailid + ", name=" + name + ", password=" + password + ", phoneno=" + phoneno
				+ "]";
	}
	public UserModel(String emailid, String name, String password, String phoneno) {
		super();
		this.emailid = emailid;
		this.name = name;
		this.password = password;
		this.phoneno = phoneno;
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
