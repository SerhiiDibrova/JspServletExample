package com.jspservlet.vo;

import java.io.Serializable;

public class VOLogin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2272190311794388367L;
	private String login;
	private String first_name;
	private Integer age;
	private String password;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
