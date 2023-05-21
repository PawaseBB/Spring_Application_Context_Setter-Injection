package com.jsp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int emp_id;
	private String name;
	private String email;
	
	
	@Value(value = "1024")
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	@Value(value = "Ram")
	public void setName(String name) {
		this.name = name;
	}


	@Value(value = "ram@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}



	public void print() {
		System.out.println(emp_id);
		System.out.println(name);
		System.out.println(email);
	}
}
