package com.zettamine.services;

import java.util.List;
import java.util.Scanner;

import com.zettamine.dao.EmployeeDAO;
import com.zettamine.dao.EmployeeDAOImpl;
import com.zettamine.dto.Employee;
import com.zettamine.hibernate.EmployeeHibernateDaoImpl;

public class EmployeeServicesImpl implements EmployeeServices {

	//private static EmployeeDAO empDAO;
	private static EmployeeHibernateDaoImpl empDAO;
	public EmployeeServicesImpl() {
		empDAO = new EmployeeHibernateDaoImpl();
		
	}
	//MG

	@Override
	public void addEmp(Employee emp) {
      int count =empDAO.insertEmployee(emp);
		if(count>0) {
			System.out.println("-----Employee Saved-----");
		}
		else
			System.out.println("-----Save operation failed----");
	}

	@Override
	public void delEmp(int id) {
		Employee emp =empDAO.searchEMployee(id);
		String opt="";
		Integer count;
		Scanner sc = new Scanner(System.in);
		if(emp!=null) {
			System.out.println(emp);
			System.out.println("Confirm Delete [Y/N]: ");
			opt =sc.next();
			if(opt.equalsIgnoreCase("y")) {
				count=empDAO.deleteEmployee(id);
				if(count!=null) {
					System.out.println("-----Employee Deleted-----");
				}
				else {
					System.out.println("-----Delete operation failed----");
				}
				
			}
		}
		else
			System.out.println("No matching records found with id: "+id);
			
		//sc.close();

	}

	@Override
	public void updEmp(int id, Employee emp) {
		int count =empDAO.updateEMployee(id, emp);
		if(count>0) {
			System.out.println("-----Employee Updated-----");
		}
		else {
			System.out.println("-----Update operation failed----");
		}

	}

	@Override
	public void displayAll() {
		List<Employee> empList = empDAO.getAllEmployees();
		System.out.println("---------------------------------------");
		System.out.println("EmpId  | Name      | DeptNo   | Salary   |");
		System.out.println("---------------------------------------");
		for (Employee emp : empList) {
			//System.out.println(emp);
			//System.out.println(emp.getEmoNo()+"\t|\t"+emp.getEmpName()+"\t|\t"+emp.getDeptNo()+"\t|\t"+emp.getSal()+"\t|");
			System.out.printf("%-6d | %-10s| %-7d  | %.2f |\n",emp.getEmpNo(),emp.getEmpName(),emp.getDeptNo(),emp.getSal());
		}
		System.out.println("---------------------------------------");
    System.out.println();
	}

	@Override
	public void searchEmp(int id) {
		Employee emp=empDAO.searchEMployee(id);
		if(emp!=null) {
			System.out.println("---------------------------------------");
			System.out.println("EmpId  | Name   | DeptNo   | Salary   |");
			System.out.println("---------------------------------------");
			System.out.printf("%-7d %-11s %-8d %.2f\n",emp.getEmpNo(),emp.getEmpName(),emp.getDeptNo(),emp.getSal());
			System.out.println("---------------------------------------");
			
		}else
			System.out.println("No matchinng records found with id: "+id);

	}

	

}
