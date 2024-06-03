package com.zettamine.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product_details")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_id")
	private Integer productId;
	@Column(name = "prod_name")
	private String productName;
	@Column(name = "prod_price")
	private Float productPrice;

}
