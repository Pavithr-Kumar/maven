package com.zettamine.mis.services;

public class UserServices {
	
	public String getNameById(int id) {
		if(id>0 && id<100)
			return "Ravi";
		else
			return null;
	}

}
