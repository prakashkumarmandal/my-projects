package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.DemoRepo;

@Service
public class DemoService {
	
	@Autowired
	private DemoRepo demoRepo;
	
	public Employee saveDate(Employee emp) {
		return demoRepo.save(emp);
	}

	public Optional<Employee> getDate(int id) {
		
		return demoRepo.findById(id);
	}

}
