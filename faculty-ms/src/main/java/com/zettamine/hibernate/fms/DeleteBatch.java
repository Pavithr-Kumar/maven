package com.zettamine.hibernate.fms;

import org.hibernate.Session;

import com.zettamine.hibernate.entities.Batch;
import com.zettamine.hibernate.entities.Faculty;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class DeleteBatch {

	public static void main(String[] args) {
		try(Session session = SessionFactoryManager.getSessionFactory().openSession()){
			Batch b1 = session.get(Batch.class, 2);
			session.beginTransaction();
			
			b1.setFaculty(null);
			session.remove(b1);
			
			session.getTransaction().commit();
		}


	}

}
