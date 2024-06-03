package com.zettamine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private int empNo;
	private String empName;
	private int deptNo;
	private float sal;
	

}
