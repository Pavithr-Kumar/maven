package com.zettamine.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.dbconfigs.ConnectionFactory;
import com.zettamine.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static Statement st =null;
	private Connection con =null;
	

	public EmployeeDAOImpl() {
		con = ConnectionFactory.getConnection();
	}

	@Override
	public Integer insertEmployee(Employee emp) {
		String query = "insert into emp values("+emp.getEmpNo()+",'"
	                   +emp.getEmpName()+"',"+emp.getDeptNo()+","
				       +emp.getSal()+");";
		try {
			st=con.createStatement();
			return st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer deleteEmployee(int id) {
		String query="delete from emp where empno ="+id;
		Integer count=null;
		try {
			st=con.createStatement();
			count= st.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public Integer updateEMployee(int id, Employee emp) {
		String query="update emp set emp_name='"+emp.getEmpName()
		            +"', deptno ="+emp.getDeptNo()+", sal ="
				   +emp.getSal()+" where empno ="+id;
		try {
			st=con.createStatement();
			return st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee searchEMployee(int id) {
		String query ="select * from emp where empno ="+id+";";
		try {
			st=con.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next())
				return new Employee(id,rs.getString(2),rs.getInt(3),rs.getFloat(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = new ArrayList<Employee>();
		String query = "select * from emp;";
				try {
					st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					while(rs.next())
					empList.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
					return empList;
				} catch (SQLException e) {
					e.printStackTrace();
				}
		return null;
	}

}
