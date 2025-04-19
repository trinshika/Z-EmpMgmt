package com.minor.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minor.emp.model.Department;

@Service
public interface DepartmentIRepo extends JpaRepository<Department, Long> {

}
