package com.zettamine.hibernate.ems;

import org.hibernate.Session;

import com.zettamine.hibernate.entities.Address;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class DeleteAddress {

	public static void main(String[] args) {
		try(Session session = SessionFactoryManager.getSessionFactory().openSession()){
			session.beginTransaction();
			session.remove(session.get(Address.class, 4));
			session.getTransaction().commit();
		}


	}

}
