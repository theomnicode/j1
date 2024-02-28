package com.brytcode.service;

import com.brytcode.models.Employee;
import com.brytcode.repo.EmployeeRepo;
import com.brytcode.repo.EmployeeRepoImpl;

import java.sql.SQLException;

public class EmployeeSOAPService implements  EmployeeService{
    EmployeeRepo empRepo;
    @Override
    public Employee getEmployee(int empNo) throws SQLException {
        return null;
    }

    @Override
    public Employee getEmployee(String empName) throws SQLException {
        return null;
    }

    @Override
    public void storeEmployee(String empName, double salary, int deptNo) throws SQLException {

    }
}
