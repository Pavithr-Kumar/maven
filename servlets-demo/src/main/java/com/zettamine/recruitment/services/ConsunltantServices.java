package com.zettamine.recruitment.services;

import com.zettamine.recruitment.dto.Consultant;

public interface ConsunltantServices {
	

	void addConsultant(Consultant consultant);
	void getConsultantById(Integer id);
	void getConsultantByName(String name);
	void getConsultantBySkill(String skill);
	void updateConsultant(Integer id);
	void deleteConsultant(Integer id);

}
