package com.zettamine.recruitment.dao;

import java.util.List;

import com.zettamine.recruitment.dto.Consultant;
import com.zettamine.recruitment.dto.Interviewer;
import com.zettamine.recruitment.dto.Recruiter;

public interface RecruiterDAO {
	
	Integer addRecruiter(Recruiter recruiter);
	Recruiter getRecruiterById(Integer id);
	List<Recruiter> getRecruiterByName(String id);
	Integer updateRecruiter(Integer id);
	Integer deleteRecruiter(Integer id);
	Integer changeEmail(Integer id, String email);
	Integer changePassword(Integer id, String password);
	
	Integer addConsultant(Consultant consultant);
	Consultant getConsultantById(Integer id);
	List<Consultant> getConsultantByName(String name);
	List<Consultant> getConsultantBySkill(String skill);
	Integer updateConsultant(Integer id);
	Integer deleteConsultant(Integer id);
	
	Integer addInterviewerDetails(Interviewer interviewer);
	Integer DeleteInterviewer(Integer id);
	Interviewer getInterviewerDetailsById(Integer id);
	List<Interviewer> getInterviewerDetailsByName(String name);
	List<Interviewer> getInterviewerDetailsByExpertise(String expertise);
	Integer updateInterviewerDetails(Integer id);
	Integer deleteInterviewerDetails(Integer id);
}
