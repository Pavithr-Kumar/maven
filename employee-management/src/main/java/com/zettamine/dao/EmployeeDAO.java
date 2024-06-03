package com.zettamine.dao;

import java.util.List;

import com.zettamine.dto.Employee;

public interface EmployeeDAO {
	Integer insertEmployee(Employee emp);
	Integer deleteEmployee(int id);
	Integer updateEMployee(int id,Employee emp);
	Employee searchEMployee(int id);
	List<Employee> getAllEmployees();

}
