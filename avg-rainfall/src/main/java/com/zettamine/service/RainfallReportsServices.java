package com.zettamine.service;

import java.util.List;

import com.zettamine.dto.AnnualRainfall;

public interface RainfallReportsServices {

	void addRainfallReporttoDB(List<AnnualRainfall> list);
	void displayCitiesWithMaxAvgRainfall();
}