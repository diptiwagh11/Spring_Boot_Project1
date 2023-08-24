package com.rt.entity;

public class Registration {
	 private  int user_id;
	 private String Name;
	 private String email;
	 private String role;
	
	 
	 public Registration(){}


	public Registration(int user_id, String name, String email, String role) {
		super();
		this.user_id = user_id;
		Name = name;
		this.email = email;
		this.role = role;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	 
	
}
