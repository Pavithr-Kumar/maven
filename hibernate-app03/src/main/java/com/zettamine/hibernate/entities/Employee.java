package com.zettamine.hibernate.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_dtls")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@Column(name = "emp_id")
	private Integer employeeId;
	@Column(name = "name")
	private String employeeName;
	@JoinColumn(name = "add_id", referencedColumnName = "addressid")
	@OneToOne(cascade = CascadeType.ALL)
	
	private Address address;
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

}
