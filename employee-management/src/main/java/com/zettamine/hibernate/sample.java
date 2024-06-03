package com.zettamine.hibernate;

import com.zettamine.dto.Employee;
import com.zettamine.hibernate.factory.SessionFactoryManager;

public class sample {

	public static void main(String[] args) {
		
		EmployeeHibernateDaoImpl obj = new EmployeeHibernateDaoImpl();
		obj.deleteEmployee(101);

	}

}
