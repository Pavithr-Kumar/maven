package com.zettamine.hibernate;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.zettamine.hibernate.entities.Student;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class FetchWithCondition {

	public static void main(String[] args) {
		
		SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
		Session session = sessFact.openSession();
		//String hql = "from com.zettamine.hibernate.entities.Student where studentName like 'S%'" ;
		//String hql =   "from com.zettamine.hibernate.entities.Student where studentId in (102,103,104)";
	  // String hql = "select studentName,studentEmail from com.zettamine.hibernate.entities.Student order by studentName";
	   
		//String hql =   "from com.zettamine.hibernate.entities.Student where studentId between ?1 and ?2";
		String hql =   "from com.zettamine.hibernate.entities.Student where studentId between :min and :max";
		Query<Student> q = session.createQuery(hql,Student.class);
		q.setParameter("min", 102);
		q.setParameter("max", 106);
		q.setFirstResult(2);
		q.setMaxResults(2);
		//Query<Object[]> q1 = session.createQuery(hql,Object[].class);
		//List<Object[]> list = q.list();
//		List<Object[]> list1 = q1.getResultList();
		List<Student> list2 = q.getResultList();
		for (Student stu : list2) {
			System.out.println(stu);
		}
		session.close();
		sessFact.close();

	}

}
