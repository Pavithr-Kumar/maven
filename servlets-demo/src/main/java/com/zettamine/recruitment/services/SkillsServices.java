package com.zettamine.recruitment.services;

import com.zettamine.recruitment.dto.Skills;

public interface SkillsServices {

	void addSkill(Skills skill);
	void getSkillById(Integer id);
	void getSkillsByName(String skill);
	void deleteSkill(Integer id);
	void updateSkill(Integer id, String skillName);

}
