package com.zettamine.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class AnnualRainfall {
	private int cityPincode;
	private String cityName;
	private double averageAnnualRainfall;
	
	public AnnualRainfall(int cityPincode, String cityName){
		this.cityName=cityName;
		this.cityPincode=cityPincode;
	}
	
	public void calculateAverageAnnualRainfall(double[] monthilyRainfall) {
		double sum=0;
		for(double x:monthilyRainfall)
			sum=sum+x;
		this.averageAnnualRainfall= sum/monthilyRainfall.length;
	}
	

}
