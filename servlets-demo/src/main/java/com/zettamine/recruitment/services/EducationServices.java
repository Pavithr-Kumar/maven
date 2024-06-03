package com.zettamine.recruitment.services;

import com.zettamine.recruitment.dto.Education;

public interface EducationServices {
	
	void addEducationDetails(Education education);
	void getEducationDetailsById(Integer id);
	void getEducationDetailsByCandidateId(Integer id);
	void updateEducationDetails(Integer id);
	void deleteEducationDetails(Integer id);

}
