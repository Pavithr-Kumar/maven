package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.hibernate.entities.Student;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class DeleteStudent {

	public static void main(String[] args) {

		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		Session session = sessFact.openSession();
		session.beginTransaction();
		//Student st = session.get(Student.class,101);
		
		Student st = new Student(103,"","");
		session.delete(st);
		session.getTransaction().commit();
		
		session.close();
		sessFact.close();
	}

}
