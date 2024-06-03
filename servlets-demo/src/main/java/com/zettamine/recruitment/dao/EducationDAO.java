package com.zettamine.recruitment.dao;

import com.zettamine.recruitment.dto.Education;

public interface EducationDAO {
	
	Integer addEducationDetails(Education education);
	Education getEducationDetailsById(Integer id);
	Education getEducationDetailsByCandidateId(Integer id);
	Integer updateEducationDetails(Integer id);
	Integer deleteEducationDetails(Integer id);
}
