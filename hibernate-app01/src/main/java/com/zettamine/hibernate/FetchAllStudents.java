package com.zettamine.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.zettamine.hibernate.entities.Student;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class FetchAllStudents {

	public static void main(String[] args) {
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		Session session = sessFact.openSession();
		session.beginTransaction();
		String hql ="from com.zettamine.hibernate.entities.Student";
		Query<Student> query = session.createQuery(hql,Student.class);
		List<Student> list = query.list();
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		session.close();
		sessFact.close();

	}

}
