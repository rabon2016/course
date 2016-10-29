package com.demo.model;

//import javax.validation.constraints.Size;

public class User {
	
	private int user_id;
	
//	@Size(min=1, max=5)
	private String user_name;
	
	private String user_password;
	
    private int user_role;
    
    private String user_phone;
    
    private String user_college;
    
    private String user_grade;
    
	public User(){}
	
	public User(int id){
		setuser_id(user_id);
	}
	
	public User(int user_id, String user_name , String user_password){
		setuser_id(user_id);
		setuser_name(user_name);
		setuser_password(user_password);
	}

	public int getuser_id() {
		return user_id;
	}

	public void setuser_id(int id) {
		this.user_id = id;
	}

	public String getuser_name() {
		return user_name;
	}

	public void setuser_name(String name) {
		this.user_name = name;
	}


	public String getuser_password() {
		return user_password;
	}

	public void setuser_password(String user_password) {
		this.user_password = user_password;
	}	
	public int getuser_role() {
		return user_role;
	}

	public void setuser_role(int user_role) {
		this.user_role = user_role;
	}
	
	public String getuser_phone() {
		return user_phone;
	}

	public void setuser_phone(String user_phone) {
		this.user_phone = user_phone;
	}	
	
	public String getuser_college() {
		return user_college;
	}

	public void setuser_college(String user_college) {
		this.user_college = user_college;
	}	
	
	public String getuser_grade() {
		return user_grade;
	}

	public void setuser_grade(String user_grade) {
		this.user_grade = user_grade;
	}
}
