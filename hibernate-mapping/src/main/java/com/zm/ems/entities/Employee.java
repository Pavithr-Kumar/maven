package com.zm.ems.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table( name = "emp")
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "empfnk")
	private List<Address> list;

}
