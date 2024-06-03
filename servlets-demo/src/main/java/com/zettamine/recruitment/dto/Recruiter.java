package com.zettamine.recruitment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recruiter {
	
	private Integer recruiter_id;
	private String name;
	private String email;
	private String password;
}
