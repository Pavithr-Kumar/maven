package com.zettamine.recruitment.services;

import com.zettamine.recruitment.dto.ConsultantSkill;

public interface ConsultantSkillServices {
	

	
	void addConsultantSkill(ConsultantSkill consultantSkill);
	void updateConsultantSkill(Integer id);
	void deleteConsultantSkill(Integer id);
	void upadteConsultantkill(Integer id, String skillName);

}
