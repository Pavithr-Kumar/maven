package com.zettamine.hibernate.pms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.zettamine.hibernate.entities.Product;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class FetchAll {

	public static void main(String[] args) {
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		Session  session = sessFact.openSession();
		String hql="from com.zettamine.hibernate.entities.Product";
		Query<Product> q= session.createQuery(hql,Product.class);
		
		List<Product> products = q.list();
		for (Product product : products) {
			System.out.println(product);
		}
		
		session.close();
		sessFact.close();
		
		

	}

}
