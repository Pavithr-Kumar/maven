package com.zettamine.recruitment.services;

import java.util.List;

import com.zettamine.recruitment.dto.Interview;

public interface InterviewServices {
	
	void scheduleInterview(Interview interview);
	void getInterviewById(Integer id);
	void getInterviewByRole(String role);
	void getInterviewByConsultantId(Integer id);
	void getInterviewByInterviewerId(Integer id);
	void deleteInterview(Integer id);
	void updateInterviewLocation(Integer id, String location);

}
