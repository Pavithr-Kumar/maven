package com.zettamine.recruitment.dao;

import com.zettamine.recruitment.dto.ConsultantSkill;

public interface ConsultantSkillDAO {
	
	Integer addConsultantSkill(ConsultantSkill consultantSkill);
	Integer updateConsultantSkill(Integer id);
	Integer deleteConsultantSkill(Integer id);
	Integer upadteConsultantkill(Integer id, String skillName);

}
