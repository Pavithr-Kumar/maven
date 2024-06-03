package com.zettamine.service;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.zettamine.dto.AnnualRainfall;

public class RainfallReport {

	public static List<AnnualRainfall> generateRainfallReport(String filePath){
		List<AnnualRainfall> rainfallList = new ArrayList<AnnualRainfall>();
		AnnualRainfall anrf;
		System.out.println(filePath);
		try {
			InputStream fin = new FileInputStream(filePath);
			Reader rdr = new InputStreamReader(fin);
			BufferedReader bfr = new BufferedReader(rdr);
			String str;
			while((str=bfr.readLine())!=null) {
				String[] strArr = str.split(",");
				//System.out.println(Arrays.toString(strArr));
			    if(validate(strArr[0])) {
			    	anrf = new AnnualRainfall(Integer.parseInt(strArr[0]),strArr[1]);
			    	double[] rnfValues =new double[strArr.length-2];
			    	for(int i=2;i<strArr.length;i++) {
			    		rnfValues[i-2]=Double.parseDouble(strArr[i]);
			    	}
			    	//System.out.println(Arrays.toString(rnfValues));
			    	anrf.calculateAverageAnnualRainfall(rnfValues);
			    	//System.out.println(anrf.getAverageAnnualRainfall());
			        rainfallList.add(anrf);
			    }
			    else
			    	throw new InvalidCityException();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rainfallList;
	}
	
	static boolean  validate(String pincode) {
		if(pincode.matches("[0-9]{5}"))
			return true;
		return false;
	}

}
