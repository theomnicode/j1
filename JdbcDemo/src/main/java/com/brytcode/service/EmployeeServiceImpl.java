package com.brytcode.service;

import com.brytcode.models.Employee;
import com.brytcode.repo.EmployeeRepo;
import com.brytcode.repo.EmployeeRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepo empRepo;
    @Autowired
    @Qualifier("myDepts")
    private Map<String, String> myDepts;

    public EmployeeRepo getEmpRepo() {
        return empRepo;
    }

    public void setEmpRepo(EmployeeRepo empRepo) {
        this.empRepo = empRepo;
    }

    @Override
    public Employee getEmployee(int empNo) throws SQLException {
        Employee empObj = empRepo.getEmployee(empNo);
        System.out.println(empObj);
        return empObj;
    }

    @Override
    public Employee getEmployee(String empName) throws SQLException {
        return empRepo.getEmployee(empName);
    }

    @Override
    public void storeEmployee(String empName, double salary, int deptNo) throws SQLException {
        Employee emp = new Employee();
        emp.setEname(empName);
        emp.setSalary(salary);
        emp.setDeptNo(deptNo);
        empRepo.storeEmployee(emp);
    }
}
