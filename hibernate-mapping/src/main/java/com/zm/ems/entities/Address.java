package com.zm.ems.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table( name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addId;
	private String city;
	private String state;
//	@ManyToMany
//	//@JoinColumn(name = "ffn_ky")
//	private List<Employee> list;
	@ManyToOne
	@JoinColumn(name = "add_fn_ky")
	private Employee emp;
}
