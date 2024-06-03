package com.zettamine.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

	public static Connection getDBConnection() {
		ResourceBundle rs= ResourceBundle.getBundle("dbconfig");
		Connection con =null;
		try {
			Class.forName(rs.getString("driver"));
			 con = DriverManager.getConnection(rs.getString("url"),rs.getString("user"),rs.getString("pass"));
			 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
