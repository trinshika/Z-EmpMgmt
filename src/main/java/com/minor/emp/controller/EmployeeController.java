package com.minor.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minor.emp.model.Employee;
import com.minor.emp.service.EmployeeIService;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	
	@Autowired
	EmployeeIService empIService;
	
	@PostMapping("save")
	public Employee save(@RequestBody Employee emp) {
		return empIService.save(emp);
	}
	
//	https://www.fb.com/suggestion/
//	http://localhost:8085/emp/save		+	emp data as json format in request body
	
//	Get -> Get
//	Post -> save
//	Put -> Update
//	delete -> delete
	
//	200 - success
//	500 - internal server error
//	404 - not found
//	400 - client side error
	
	
}
