package com.zettamine.hibernate.pms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.hibernate.entities.Product;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class DeleteProduct {

	public static void main(String[] args) {
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		Session session = sessFact.openSession();
		session.beginTransaction();
		session.delete(session.get( Product.class,3));
		session.getTransaction().commit();
		session.close();
		sessFact.close();

	}

}
