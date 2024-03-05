package com.brytcode.repo;

import java.sql.SQLException;

import com.brytcode.model.Employee;


public interface EmployeeRepo {
	public void storeEmployee(Employee emp) throws SQLException, ClassNotFoundException;
	public Employee getEmployee(String uuid) throws SQLException;
}
