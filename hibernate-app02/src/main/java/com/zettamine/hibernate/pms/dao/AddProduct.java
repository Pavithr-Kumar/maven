package com.zettamine.hibernate.pms.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.hibernate.entities.Product;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class AddProduct {

	public static void main(String[] args) {
	//	Logger logger = LogManager.getLogger(AddProduct.class);
		
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		Session session = sessFact.openSession();
		session.beginTransaction();
		Product prod1=new Product(null, "vivo y21", 25000f);
		Product prod2=new Product(null, "Smart watch", 20000f);
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(null,"Laptop",30000f));
		products.add(new Product(null,"Electric Fan",28000f));
		products.add(new Product(null,"Cricket Bat",25000f));
		//logger.info("debgug message");
		for (Product product : products) {
			
			session.save(product);
		}
		
		
		session.getTransaction().commit();
		session.close();
		sessFact.close();

	}

}
