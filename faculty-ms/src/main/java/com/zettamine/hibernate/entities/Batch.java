package com.zettamine.hibernate.entities;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bacth")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer batchId;
	private String course;
	@ManyToOne(cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name = "faculty")
	private Faculty faculty;

}
