package com.zettamine.hibernate.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "faculty")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {
	@Id
	private Integer facultyId;
	private String facultyName;
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Batch> batches;
	

}
