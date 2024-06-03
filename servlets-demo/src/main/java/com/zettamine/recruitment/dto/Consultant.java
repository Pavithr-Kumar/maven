package com.zettamine.recruitment.dto;

import java.io.File;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consultant {
	
	private Integer consultant_id;
	private String consultant_name;
	private String email;
	private String phone_number;
	private Education education;
	private File photo;
	private ConsultantSkill skill;
	private String resume;

}
