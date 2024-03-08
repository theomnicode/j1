package com.brytcode.restdemo.service;

import java.sql.SQLException;

import com.brytcode.restdemo.dto.EmployeeDTO;
import com.brytcode.restdemo.model.Employee;
import com.brytcode.restdemo.repo.EmployeeJPARepo;
import com.brytcode.restdemo.repo.EmployeeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
	@Autowired
	private EmployeeJPARepo jpaRepo;
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
	public Employee getEmployee(String uuid) throws SQLException {
		return jpaRepo.findByUUID(uuid);
	}
	public Employee getEmployeeByEmpno(int empNo) throws SQLException {
		return jpaRepo.findById(empNo).orElse(new Employee());
	}
}
