package com.zettamine.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zettamine.hibernate.entities.Student;
import com.zettamine.hibernate.utils.SessionFactoryManager;

public class SaveMultipleStudents {

	public static void main(String[] args) {
		SessionFactory sfact = SessionFactoryManager.getSessionFactory();
		Session session = sfact.openSession();
		Transaction txn = session.beginTransaction();
		Student st;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter Student name and email");
			String name=scan.next();
			st= new Student(null,name,scan.next());
			
			session.save(st);
			System.out.print("Do you want to insert more students? [Y/N]:");
			
			
		}while(scan.next().equalsIgnoreCase("y"));
		
		scan.close();
		txn.commit();
		session.close();
		sfact.close();

	}

}
