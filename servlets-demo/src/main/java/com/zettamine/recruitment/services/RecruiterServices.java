package com.zettamine.recruitment.services;

import java.util.List;

import com.zettamine.recruitment.dto.Consultant;
import com.zettamine.recruitment.dto.Interviewer;
import com.zettamine.recruitment.dto.Recruiter;

public interface RecruiterServices {
	
	void addRecruiter(Recruiter recruiter);

	void getRecruiterById(Integer id);

	void getRecruiterByName(String id);

	void updateRecruiter(Integer id);

	void deleteRecruiter(Integer id);

	void changeEmail(Integer id, String email);

	void changePassword(Integer id, String password);

	void addConsultant(Consultant consultant);

	void getConsultantById(Integer id);

	void getConsultantByName(String name);

	void getConsultantBySkill(String skill);

	void updateConsultant(Integer id);

	void deleteConsultant(Integer id);

	void addInterviewerDetails(Interviewer interviewer);

	void DeleteInterviewer(Integer id);

	void getInterviewerDetailsById(Integer id);

	void getInterviewerDetailsByName(String name);

	void getInterviewerDetailsByExpertise(String expertise);

	void updateInterviewerDetails(Integer id);

	void deleteInterviewerDetails(Integer id);
}
