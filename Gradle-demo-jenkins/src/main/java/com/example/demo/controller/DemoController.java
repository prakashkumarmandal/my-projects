package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/Home")
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@PostMapping("/data")
	public ResponseEntity<Employee> saveData(@RequestBody Employee obj) {
		return new ResponseEntity<Employee>(demoService.saveDate(obj),HttpStatus.OK);
	}
	
	@GetMapping("/data/{id}")
	public ResponseEntity<Optional<Employee>> saveData(@PathVariable int id) {
		return new ResponseEntity<Optional<Employee>>(demoService.getDate(id),HttpStatus.OK);
	}

}
