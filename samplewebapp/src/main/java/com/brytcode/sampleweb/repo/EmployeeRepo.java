package com.brytcode.sampleweb.repo;

import java.sql.SQLException;

import com.brytcode.sampleweb.model.Employee;

public interface EmployeeRepo {
	public void storeEmployee(Employee emp) throws SQLException, ClassNotFoundException;
	public Employee getEmployee(String uuid) throws SQLException;
}
