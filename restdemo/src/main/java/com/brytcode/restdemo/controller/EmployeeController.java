package com.brytcode.restdemo.controller;

import com.brytcode.restdemo.dto.EmployeeDTO;
import com.brytcode.restdemo.model.Employee;
import com.brytcode.restdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping(path="{uuid}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Employee getEmployee(@PathVariable("uuid") String uuid){
        try{
            return employeeService.getEmployee(uuid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping
    public String getEmployee(@RequestBody EmployeeDTO emp){
        employeeService.registerEmployee(emp);
        return "SUCCESS";
    }
    @GetMapping(path="id/{empNo}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Employee getEmployee(@PathVariable("empNo") int empNo){
        try{
            return employeeService.getEmployeeByEmpno(empNo);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
