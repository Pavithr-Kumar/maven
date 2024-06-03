package com.zettamine.recruitment.services;

import com.zettamine.recruitment.dto.Interviewer;

public interface InterviewerServices {

	void addInterviewerDetails(Interviewer interviewer);
	void DeleteInterviewer(Integer id);
	void getInterviewerDetailsById(Integer id);
	void getInterviewerDetailsByName(String name);
	void getInterviewerDetailsByExpertise(String expertise);
	void updateInterviewerDetails(Integer id);
	void deleteInterviewerDetails(Integer id);

}
