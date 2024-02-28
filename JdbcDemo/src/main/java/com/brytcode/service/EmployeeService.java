package com.brytcode.service;

import com.brytcode.models.Employee;

import java.sql.SQLException;

public interface EmployeeService {
    public Employee getEmployee(int empNo) throws SQLException;
    public Employee getEmployee(String empName) throws SQLException;
    public void storeEmployee(String empName, double salary, int deptNo ) throws SQLException;
}
