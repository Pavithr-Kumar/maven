package com.zettamine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.dbconfig.ConnectionFactory;
import com.zettamine.dto.AnnualRainfall;

public class RainfallDAOImpl implements RainfallDAO {
	Connection con;
	Statement st;
	public RainfallDAOImpl(){
		con = ConnectionFactory.getDBConnection();
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insertRainfallReport(int pincode, String cityName, double avgRainfall) {
		String query ="insert into annual_rainfall values(?,?,?);";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, pincode);
			pst.setString(2, cityName);
			pst.setDouble(3, avgRainfall);
			int count =pst.executeUpdate();
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<AnnualRainfall> getCitiesHavingMaxAvgRnf() {
		List<AnnualRainfall> report = new ArrayList<AnnualRainfall>();
		String query ="select * from annual_rainfall"
				   +  " where average_annual_rainfall"
				   +  " in (select max(average_annual_rainfall) from annual_rainfall);";
	ResultSet rs;
	try {
		rs = st.executeQuery(query);
		while(rs.next()) {
			report.add(new AnnualRainfall(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	     return report;
		
	}

}
