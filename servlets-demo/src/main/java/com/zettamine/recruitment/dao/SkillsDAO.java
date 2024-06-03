package com.zettamine.recruitment.dao;

import com.zettamine.recruitment.dto.Skills;

public interface SkillsDAO {
	
	Integer addSkill(Skills skill);
	Skills getSkillById(Integer id);
	Skills getSkillsByName(String skill);
	Integer deleteSkill(Integer id);
	Integer updateSkill(Integer id, String skillName);

}
