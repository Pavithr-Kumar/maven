package com.zettamine.recruitment.dao;

import java.util.List;

import com.zettamine.recruitment.dto.Consultant;

public interface ConsultantDAO {
	
	Integer addConsultant(Consultant consultant);
	Consultant getConsultantById(Integer id);
	List<Consultant> getConsultantByName(String name);
	List<Consultant> getConsultantBySkill(String skill);
	Integer updateConsultant(Integer id);
	Integer deleteConsultant(Integer id);
}
