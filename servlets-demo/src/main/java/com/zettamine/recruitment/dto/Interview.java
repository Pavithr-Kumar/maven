package com.zettamine.recruitment.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Interview {
	
	private Integer interviewId;
	private String role;
	private Integer consultantId;
	private Integer interviewerId;
	private Date dateOfInterview;
	private String location;

}
