package com.brytcode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.brytcode.model.Employee;

@Controller
public class WelcomeController {
	@RequestMapping(path = "/welcome", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Employee> welcome() {		
		Employee  emp = new Employee();
		emp.setEmpNo(1341);
		emp.setEname("Ramesh");
		emp.setDeptNo(1);						
	    return  ResponseEntity
	               .ok()
	               .contentType(MediaType.APPLICATION_JSON)
	               .body(emp);
	}
}
