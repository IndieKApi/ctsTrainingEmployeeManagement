package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

	@Autowired
	EmployeeRepo empRepo;

	@Override
	public String addEmployee(Employee employee) {
		
		Employee emp = empRepo.save(employee);
		
		if(emp!=null) return "Employee Saved Succfully";
		
		return "Employee Faild to Save";
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empRepo.findAll();
	}

}
