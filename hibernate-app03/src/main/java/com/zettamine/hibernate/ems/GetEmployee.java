package com.zettamine.hibernate.ems;

import java.util.List;

import org.hibernate.Session;

import com.zettamine.hibernate.entities.Employee;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class GetEmployee {

	public static void main(String[] args) {
		try(Session session = SessionFactoryManager.getSessionFactory().openSession()){
			String hql ="from com.zettamine.hibernate.entities.Employee";
			List<Employee> list = session.createQuery(hql,Employee.class).getResultList();
			for (Employee employee : list) {
				System.out.println(employee);
			}
		}

	}

}
