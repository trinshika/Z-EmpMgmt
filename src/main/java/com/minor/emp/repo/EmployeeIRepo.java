package com.minor.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minor.emp.model.Employee;

@Repository
public interface EmployeeIRepo extends JpaRepository<Employee, Long>{

}
