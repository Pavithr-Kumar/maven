package com.zettamine.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.dao.EmployeeDAO;
import com.zettamine.dto.Employee;
import com.zettamine.hibernate.factory.SessionFactoryManager;

public class EmployeeHibernateDaoImpl implements EmployeeDAO {

	 

	
	@Override
	public Integer insertEmployee(Employee emp) {
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		
		Session session  = sessFact.openSession();
		session.beginTransaction();
        Integer count =(Integer) session.save(emp);
        session.getTransaction().commit();
		session.close();
		sessFact.close();
		return count;
		
	}

	@Override
	public Integer deleteEmployee(int id) {
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		//sessFact = SessionFactoryManager.getSessionFactory();
		Session session  = sessFact.openSession();
		session.beginTransaction();
		//Employee e = new Employee(105,"dhfhj",34,4745);
		Employee emp = session.get(Employee.class,id);
		if(emp!=null) {
			session.delete(emp);
			session.getTransaction().commit();
			session.close();
			sessFact.close();
			return 1;
		}
		session.close();
		sessFact.close();
		return 0;
	}

	@Override
	public Integer updateEMployee(int id, Employee emp) {
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		//sessFact = SessionFactoryManager.getSessionFactory();
		Session session  = sessFact.openSession();
		session.beginTransaction();
		Employee emp1 = session.get(Employee.class, id);
		if(emp1!=null) {
			session.update(emp);
			session.getTransaction().commit();
			session.close();
			sessFact.close();
			return 1;
		}
		session.getTransaction().commit();
		session.close();
		//sessFact.close();
		return 0;
	}

	@Override
	public Employee searchEMployee(int id) {
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		//sessFact = SessionFactoryManager.getSessionFactory();
		Session session  = sessFact.openSession();
		session.beginTransaction();
		Employee emp = session.get(Employee.class, id);
		session.getTransaction().commit();
		session.close();
		sessFact.close();
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
