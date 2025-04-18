package com.minor.emp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq", allocationSize = 1)
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
	private Long id;
	
	private String name;
	
	private String address;
	
	private String gender;
	
	private Long phoneNum;
	
	private String department;
	
}
