package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zettamine.hibernate.entities.Student;

public class SaveStudent {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessFact = config.buildSessionFactory();
		Session  session = sessFact.openSession();
		
		session.beginTransaction();
		Student stObj1 = new Student(101,"Ravi","ravi@gmail.com");
		Student stObj2 = new Student(102,"Raju","raju@gmail.com");
		
		session.save(stObj2);
		System.out.println("--------------------");
		session.getTransaction().commit();
		
		session.close();
		
		sessFact.close();
		
	}

}
