package com.minor.emp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "emp_department_seq", sequenceName = "emp_department_seq", allocationSize = 1)
@Table(name = "EMP_DEPARTMENT")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_department_seq")
	private Long id;
	
	private String name;
	
	private Integer code;
	
	private String head;
	
}
