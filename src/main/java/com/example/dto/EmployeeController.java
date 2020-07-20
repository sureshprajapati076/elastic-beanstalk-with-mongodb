package com.example.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping(value="/add")
	public Employee addEmp(@RequestBody Employee employee) {

		return  employeeRepository.insert(employee);

	}
	
	@GetMapping(value="/all")
	public List<Employee> addEmap() {
		return employeeRepository.findAll();
	}

}
