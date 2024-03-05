package com.brytcode.service;

import java.sql.SQLException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brytcode.dto.EmployeeDTO;
import com.brytcode.model.Employee;
import com.brytcode.repo.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
	public boolean registerEmployee(String ename, Double empSalary, int deptNo) {
		Employee emp = new Employee();
		emp.setEname(ename);
		emp.setSalary(empSalary);
		emp.setDeptNo(deptNo);
		try {
			empRepo.storeEmployee(emp);
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean registerEmployee(EmployeeDTO dto) {
		Employee emp = new Employee();
		BeanUtils.copyProperties(dto, emp);
		try {
			empRepo.storeEmployee(emp);
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
