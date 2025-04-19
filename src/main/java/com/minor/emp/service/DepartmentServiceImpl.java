package com.minor.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minor.emp.model.Department;
import com.minor.emp.repo.DepartmentIRepo;

@Service
public class DepartmentServiceImpl implements DepartmentIService {
	
	@Autowired 
	DepartmentIRepo dptIRepo;
	
	public Department save(Department dpt) {
		return dptIRepo.save(dpt);
	}
}
