package com.zettamine.recruitment.dao;

import java.util.List;

import com.zettamine.recruitment.dto.Interview;

public interface InterviewDAO {
	
	Integer scheduleInterview(Interview interview);
	Interview getInterviewById(Integer id);
	List<Interview> getInterviewByRole(String role);
	List<Interview> getInterviewByConsultantId(Integer id);
	List<Interview> getInterviewByInterviewerId(Integer id);
	Integer deleteInterview(Integer id);
	Integer updateInterviewLocation(Integer id, String location);
}
