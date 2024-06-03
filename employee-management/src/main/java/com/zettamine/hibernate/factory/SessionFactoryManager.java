package com.zettamine.hibernate.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryManager {
	
	
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory=null;
		
		Configuration config=null;
		
		
		config = new Configuration();
		config.configure("hibernate.config.xml");
		
		if(sessionFactory==null) {
			
			sessionFactory= config.buildSessionFactory();
		}
		
		return sessionFactory;
	}

}
