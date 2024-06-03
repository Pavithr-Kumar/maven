package com.zettamine.services;

import com.zettamine.dto.Employee;

public interface EmployeeServices {
	void addEmp(Employee emp);
	void delEmp(int id);
	void updEmp(int id,Employee emp);
	void displayAll();
	void searchEmp(int id);

}
