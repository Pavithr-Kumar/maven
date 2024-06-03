package com.zettamine.ems;

import java.util.Scanner;

import com.zettamine.dto.Employee;
import com.zettamine.services.EmployeeServices;
import com.zettamine.services.EmployeeServicesImpl;

public class EmployeeManagementSystem {


	public static void main(String[] args) {
		EmployeeServices services = new EmployeeServicesImpl();

		Scanner scan = new Scanner(System.in);
		int opt,id,dept;
		String name;
		float sal;
		
		while(true) {
			System.out.println("1. Add New Employee\n2. Search Employee\n"
					         + "3. Update Employee\n4. Delete Employee\n5. Display All\n6. Exit ");
			System.out.print("Enter a option: ");
			
			opt=scan.nextInt();
			switch(opt) {
			case 1:
				System.out.print("Enter employee id: ");
				id=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter employee name: ");
				name=scan.nextLine();
				System.out.print("Enter employee deptNo: ");
				dept=scan.nextInt();
				System.out.print("Enter employee salary: ");
				sal=scan.nextFloat();
				services.addEmp(new Employee(id, name, dept, sal));
				break;
			case 2:
				System.out.print("Enter employee id : ");
				id=scan.nextInt();
				services.searchEmp(id);
				break;
			case 3:
				System.out.print("Enter employee id: ");
				id=scan.nextInt();
				scan.nextLine();
				System.out.print("Enter employee name: ");
				name=scan.nextLine();
				System.out.print("Enter employee deptNo: ");
				dept=scan.nextInt();
				System.out.print("Enter employee salary: ");
				sal=scan.nextFloat();
				services.updEmp(id, new Employee(id, name, dept, sal));
				break;
			case 4:
				System.out.print("Enter employee id: ");
				id=scan.nextInt();
				services.delEmp(id);
				break;
			case 5:
				services.displayAll();
				break;
			case 6:
				System.out.println("This application was developed by team @ Zettamine");
				return;
			default:
				System.out.println("Invalid option --- try again");
				
			}
		}
		
	}
	

}
