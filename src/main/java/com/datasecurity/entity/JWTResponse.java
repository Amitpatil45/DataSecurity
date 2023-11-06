package com.datasecurity.entity;

import java.util.Set;

public class JWTResponse {
	private String token;
	private String name;
	private String userName;
	private String email;
	private String phone;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public JWTResponse(String token, String name, String userName,  String email, String phone) {
		super();
		this.token = token;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
	}
	public JWTResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
