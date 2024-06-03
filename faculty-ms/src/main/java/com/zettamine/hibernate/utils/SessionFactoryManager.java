package com.zettamine.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryManager {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");

			sessionFactory = config.buildSessionFactory();
		}
		return sessionFactory;
	}

}
