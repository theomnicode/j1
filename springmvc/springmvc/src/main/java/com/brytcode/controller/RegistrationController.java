package com.brytcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brytcode.dto.EmployeeDTO;
import com.brytcode.service.EmployeeService;

@Controller
public class RegistrationController {
	@Autowired
	EmployeeService empService;
	@RequestMapping("/register")
	public String registration() {
		return "registration";
	} 
	
	@PostMapping("/registeremp")
	public String RegisterEmployee(@RequestParam("ename") String empName, 
								   @RequestParam("empsalary") Double empSalary,
								   @RequestParam("deptno") int deptNo) {		
		if(empService.registerEmployee(empName, empSalary, deptNo)) {
			return "success";
		}else {
			return "error";
		}				
	}
	
	@PostMapping("/registeremp2")
	public String RegisterEmployeeSpringForm(@ModelAttribute("regemp") EmployeeDTO empDto) {		
		if(empService.registerEmployee(empDto)) {
			return "success";
		}else {
			return "error";
		}				
	}
	
	@RequestMapping("/register2")
	public ModelAndView registrationWithAttachedModel() {
		ModelAndView modelAndView = new ModelAndView("registrationspringforms");
		EmployeeDTO emp = new EmployeeDTO(); 
		emp.setEname("Jhon");
		modelAndView.addObject("regemp", emp);
		return modelAndView;
	} 

}
