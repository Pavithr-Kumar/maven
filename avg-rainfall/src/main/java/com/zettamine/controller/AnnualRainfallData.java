package com.zettamine.controller;

import java.util.List;

import com.zettamine.dto.AnnualRainfall;
import com.zettamine.service.RainfallReport;
import com.zettamine.service.RainfallReportsServices;
import com.zettamine.service.RainfallReportsServicesImpl;

public class AnnualRainfallData {

	public static void main(String[] args) {
		List<AnnualRainfall>rnfList = RainfallReport.generateRainfallReport("D:\\Pavithr Kumar\\java\\maven\\avg-rainfall\\src\\main\\resources\\AllCityMonthlyRainfall.txt");
		RainfallReportsServices services = new RainfallReportsServicesImpl();
	//	services.addRainfallReporttoDB(rnfList);
		services.displayCitiesWithMaxAvgRainfall();

	}

}
