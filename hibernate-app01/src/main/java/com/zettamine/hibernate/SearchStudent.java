package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.hibernate.entities.Student;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class SearchStudent {

	public static void main(String[] args) {
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		Session session = sessFact.openSession();
		System.out.println(session.get(Student.class, 1012));
		
		session.close();
		sessFact.close();
		

	}

}
