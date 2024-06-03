package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.hibernate.entities.Student;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class UpdateStudent {

	public static void main(String[] args) {
		
     SessionFactory sessFact = SessionFactoryManager.getSessionFactory();
     
     Session session = sessFact.openSession();
     session.beginTransaction();
//     Student st = session.get(Student.class,101);
//     st.setStudentName("Ravi");
     
     session.update(new Student(101,"Ravi Kumar","ravi@zetta.in"));
     session.getTransaction().commit();
     System.out.println("Updated Successfully");
     session.close();
     sessFact.close();
     
	}

}
