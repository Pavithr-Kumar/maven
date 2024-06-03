package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.zettamine.hibernate.utils.SessionFactoryManager;

public class DMLWithHQL {

	public static void main(String[] args) {
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		Session session = sessFact.openSession();
		session.beginTransaction();
		String hql="update com.zettamine.hibernate.entities.Student set studentName = 'Gowri Shankar' where studentId=:id";
		
		Query q = session.createQuery(hql);
		q.setParameter("id", 107);
		int rowsUpdated = q.executeUpdate();
		System.out.println("updated rows = "+rowsUpdated);
		//session.getTransaction().commit();
		session.close();
		sessFact.close();
	}

}
