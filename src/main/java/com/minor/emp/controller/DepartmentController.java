package com.minor.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minor.emp.model.Department;
import com.minor.emp.service.DepartmentIService;

@RequestMapping("dpt")
@RestController
public class DepartmentController {

	@Autowired
	DepartmentIService dptIService;
	
	@PostMapping("save")
	public Department save(@RequestBody Department x) {
		return dptIService.save(x);	
	}

}
