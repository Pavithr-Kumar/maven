package com.zettamine.service;

import java.util.List;

import com.zettamine.dao.RainfallDAO;
import com.zettamine.dao.RainfallDAOImpl;
import com.zettamine.dto.AnnualRainfall;

public class RainfallReportsServicesImpl implements RainfallReportsServices {
	RainfallDAO rfd ;
  public RainfallReportsServicesImpl(){
		
		rfd = new RainfallDAOImpl();
	}
	public void addRainfallReporttoDB(List<AnnualRainfall> list){
				
		for(AnnualRainfall anrf: list)
		rfd.insertRainfallReport(anrf.getCityPincode(), anrf.getCityName(), anrf.getAverageAnnualRainfall());
	}
	
	public void displayCitiesWithMaxAvgRainfall() {
		List<AnnualRainfall> rainfalldata = rfd.getCitiesHavingMaxAvgRnf();
		for (AnnualRainfall anrf : rainfalldata) {
			
			System.out.println(anrf);
		}
		
	}

	

}
