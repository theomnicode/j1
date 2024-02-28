package com.brytcode;

import com.brytcode.models.Employee;
import com.brytcode.repo.EmployeeRepoImpl;
import com.brytcode.service.EmployeeService;
import com.brytcode.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;
//@Configuration
@ComponentScan(basePackages = "com.brytcode")
public class Main {
    public static void main(String[] args) {
     /*  *//* Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee no");
        int empNo = Integer.parseInt(sc.nextLine());
        EmployeeRepo empRepo = new EmployeeRepo();
        Employee emp = null;
        try {
            emp = empRepo.getEmployee(empNo);
            System.out.println(emp);
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Unable to fetch the employee details");
        }*//*
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter employee name");
//        String empName = sc.nextLine();
        EmployeeRepoImpl empRepo = new EmployeeRepoImpl();
//        Employee emp = null;
//        try {
//            emp = empRepo.getEmployee(empName);
//            System.out.println(emp);
//        }catch(SQLException ex){
//            ex.printStackTrace();
//            System.out.println("Unable to fetch the employee details");
//        }
        try{
            Employee emp = new Employee();
//            System.out.println("Enter empId");
//            emp.setEmpNo(Integer.parseInt(sc.nextLine()));
            System.out.println("Enter emp name");
            emp.setEname(sc.nextLine());
            System.out.println("Enter salary");
            emp.setSalary(Double.parseDouble(sc.nextLine()));
            System.out.println("Enter deptno");
            emp.setDeptNo(Integer.parseInt(sc.nextLine()));
            empRepo.storeEmployee(emp);
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Unable to fetch the employee details");
        }*/

        Scanner sc = new Scanner(System.in);
        try{
            Employee emp = new Employee();
            //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
            EmployeeService employeeService = applicationContext.getBean("employeeServiceImpl",EmployeeService.class);
            System.out.println("Enter emp name");
            String empName = sc.nextLine();
            System.out.println("Enter salary");
            double salary = Double.parseDouble(sc.nextLine());
            System.out.println("Enter deptno");
            int deptNo = Integer.parseInt(sc.nextLine());
            employeeService.storeEmployee(empName, salary, deptNo);
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Unable to fetch the employee details");
        }
    }
}