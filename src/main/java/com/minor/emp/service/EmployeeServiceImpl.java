package com.minor.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minor.emp.model.Employee;
import com.minor.emp.repo.EmployeeIRepo;

@Service
public class EmployeeServiceImpl implements EmployeeIService{
	
	@Autowired
	EmployeeIRepo empIRepo;
	
//	1. save			arg : Employee			return : Employee with id
	
	public Employee save(Employee emp) {
		return empIRepo.save(emp);
	}
	
	
//	2. update		arg : Employee w Id		return : Updated Emp
//	3. getOne		arg : Id				return : Employee
//	4. getAll		arg : -----				return : List<Employee>
//	5. delete		arg : id				return : ----------
	
	
}
