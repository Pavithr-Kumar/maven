package com.zettamine.dbconfigs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

	public static Connection getConnection() {
		Connection con =null;
		ResourceBundle b= ResourceBundle.getBundle("com/zettamine/dbconfigs/dbconfig");
		try {
			Class.forName(b.getString("driver"));
			con = DriverManager.getConnection(b.getString("url"),b.getString("user"),b.getString("pass"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
