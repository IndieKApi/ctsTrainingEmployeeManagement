package com.example.demo.exceptions;
 
public class EmployeeNotFound extends RuntimeException {
 
	public EmployeeNotFound(String msg) {
		super(msg);
	}
	
}