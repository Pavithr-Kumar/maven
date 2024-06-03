package com.zettamine.mis.services;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1.User Services\n2.Num Services\n3.Exit\nEnter a option");
		int opt =scan.nextInt();
		switch(opt) {
		case 1:
			System.out.print("Enter id :");
			int id=scan.nextInt();
			UserServices services = new UserServices();
			String name = services.getNameById(id);
			if(name !=null)
				System.out.println("Hi "+name+", welcome to zettamine");
			else
				System.out.println("No users with id "+id);
			break;
		case 2:
			System.out.print("Enter a number :");
			int num = scan.nextInt();
			NumServices ser = new NumServices();
		    if(ser.checkEvenOrOdd(num))
		    	System.out.println("It is a Even Number");
		    else
		    	System.out.println("Ti is a Odd Number");
		    break;
		case 3:
			System.out.println("This app was developed by team @ Zettamine");
		}
		scan.close();

	}

}
