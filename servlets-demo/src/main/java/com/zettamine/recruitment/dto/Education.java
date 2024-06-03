package com.zettamine.recruitment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
	
	private Integer educationId;
	private Integer consultantId;
	private String highestQulification;
	private String collegeName;
	private Float totalAgrigate;
	private String certifications;
}
