package com.brytcode.restdemo.repo;

import com.brytcode.restdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJPARepo extends JpaRepository<Employee, Integer> {
	Employee findByUUID(String uuid);
}
