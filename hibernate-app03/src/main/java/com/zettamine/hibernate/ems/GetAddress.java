package com.zettamine.hibernate.ems;

import java.util.List;

import org.hibernate.Session;

import com.zettamine.hibernate.entities.Address;
import com.zettamine.hibernate.entities.Employee;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class GetAddress {

	public static void main(String[] args) {
		try(Session session = SessionFactoryManager.getSessionFactory().openSession()){
			String hql ="from com.zettamine.hibernate.entities.Address";
			List<Address> list = session.createQuery(hql,Address.class).getResultList();
			for (Address add : list) {
				System.out.println(add);
			}
		}


	}

}
