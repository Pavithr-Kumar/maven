package com.zettamine.recruitment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Interviewer {
	
	private Integer interviewerId;
	private String intervieerName;
	private String email;
	private String expertise;

}
