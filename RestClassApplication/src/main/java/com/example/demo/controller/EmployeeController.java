package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

import com.example.demo.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/cts")
public class EmployeeController {

	@Autowired
	EmployeeServiceInterface empService;

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee emp)
	{
		return empService.addEmployee(emp);
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee()
	{
		return empService.getAllEmployee();
	}
}
