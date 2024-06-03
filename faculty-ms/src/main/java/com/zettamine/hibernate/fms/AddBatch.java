package com.zettamine.hibernate.fms;

import org.hibernate.Session;

import com.zettamine.hibernate.entities.Batch;
import com.zettamine.hibernate.entities.Faculty;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class AddBatch {

	public static void main(String[] args) {
		try(Session session = SessionFactoryManager.getSessionFactory().openSession()){
			Batch b1 = new Batch(null, "C++ Course", null);
			session.beginTransaction();
			Faculty f1 = session.get(Faculty.class, 101);
			b1.setFaculty(f1);
			
			session.persist(b1);
			
			session.getTransaction().commit();
		}

	}

}
