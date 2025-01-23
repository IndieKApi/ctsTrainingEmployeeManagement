package com.example.demo.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.repository.EmployeeRepo;
 
@Service
public class EmployeeService {
	@Autowired
	public EmployeeRepo empRepo;
}
 