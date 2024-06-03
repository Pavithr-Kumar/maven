package com.zettamine.dao;

import java.util.List;

import com.zettamine.dto.AnnualRainfall;

public interface RainfallDAO {

	int insertRainfallReport(int pincode,String cityName,double avgRainfall);
	List<AnnualRainfall> getCitiesHavingMaxAvgRnf() ;
}
