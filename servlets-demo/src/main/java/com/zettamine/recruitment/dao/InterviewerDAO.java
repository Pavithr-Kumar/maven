package com.zettamine.recruitment.dao;

import java.util.List;

import com.zettamine.recruitment.dto.Interviewer;

public interface InterviewerDAO {

	Integer addInterviewerDetails(Interviewer interviewer);
	Integer DeleteInterviewer(Integer id);
	Interviewer getInterviewerDetailsById(Integer id);
	List<Interviewer> getInterviewerDetailsByName(String name);
	List<Interviewer> getInterviewerDetailsByExpertise(String expertise);
	Integer updateInterviewerDetails(Integer id);
	Integer deleteInterviewerDetails(Integer id);

}
