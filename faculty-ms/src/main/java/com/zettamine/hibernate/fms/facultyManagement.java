package com.zettamine.hibernate.fms;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.zettamine.hibernate.entities.Batch;
import com.zettamine.hibernate.entities.Faculty;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class facultyManagement {

	public static void main(String[] args) {
		try(Session session = SessionFactoryManager.getSessionFactory().openSession()){
			session.beginTransaction();
			Faculty f1 = new Faculty();
			f1.setFacultyId(102);
			f1.setFacultyName("Ravi Kumar");
		    List<Batch> list = new ArrayList<>();
		    list.add(new Batch(null, "sql course",f1));
//		    list.add(new Batch(null, "python course", f1));
//		    list.add(new Batch(null, "react course", f1));
		    f1.setBatches(list);
		    session.persist(f1);
			session.getTransaction().commit();
		}


	}

}
