package com.example.demo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 
import com.example.demo.service.EmployeeService;
 
@Controller
public class EmployeeController {
	@Autowired
	public EmployeeService empSer;
}
 