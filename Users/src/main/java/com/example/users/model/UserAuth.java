package com.example.users.model;

public class UserAuth {

	
	String emailid;
	String password;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserAuth [emailid=" + emailid + ", password=" + password + "]";
	}
	public UserAuth(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}
	public UserAuth() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
