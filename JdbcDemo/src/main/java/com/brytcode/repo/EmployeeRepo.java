package com.brytcode.repo;

import com.brytcode.models.Employee;

import java.sql.SQLException;

public interface EmployeeRepo {
    public Employee getEmployee(int empNo) throws SQLException;
    public Employee getEmployee(String empName) throws SQLException;
    public void storeEmployee(Employee emp) throws SQLException;
}
