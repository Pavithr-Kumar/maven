package com.zettamine.hibernate.ems;

import org.hibernate.Session;

import com.zettamine.hibernate.entities.Address;
import com.zettamine.hibernate.entities.Employee;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class AddEmployee {

	public static void main(String[] args) {
		Address ad1 = new Address(null, "Scindia", "Vizag",null);
		Employee emp1 = new Employee(106, "Bharath Kumar", ad1);
		ad1.setEmployee(emp1);
		try(Session session = SessionFactoryManager.getSessionFactory().openSession()){
			
			session.beginTransaction();
			session.persist(emp1);
			session.getTransaction().commit();
			
		}

	}

}
