package com.zm.ems.services;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

import com.zettamine.hibernate.utils.SessionFactoryManager;
import com.zm.ems.entities.Address;
import com.zm.ems.entities.Employee;

public class AddEmp {

	public static void main(String[] args) {
		try(Session session = SessionFactoryManager.getSessionFactory().openSession()){
			session.beginTransaction();
			Address a1 = new Address();
			a1.setCity("Gajuwaka");
			a1.setState("AP");
			Address a2 = new Address();
			a2.setCity("Ameerpet");
			a2.setState("TS");
			List<Address> list = Arrays.asList(a1,a2);
			
			Employee e1 = new Employee();
			e1.setEmpId(101);
			e1.setEmpName("Ravi Kumar");
			
//			Employee e2 = new Employee();
//			e2.setEmpId(102);
//			e2.setEmpName("Kiran reddy");
			a1.setEmp(e1);
			a2.setEmp(e1);
			//e1.setAddress(a1);
//			List<Employee> list1 = Arrays.asList(e1);
//			List<Employee> list2 = Arrays.asList(e1);
    	    e1.setList(list);
//			a2.setList(list2);
			//e2.setList(list);
			session.persist(e1);
			
			session.getTransaction().commit();
			System.out.println("Success");
		}

	}

}
