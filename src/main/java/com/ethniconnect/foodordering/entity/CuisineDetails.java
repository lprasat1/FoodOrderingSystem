package com.ethniconnect.foodordering.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity()
@Table(name="cuisine_master")
public class CuisineDetails {
	@Id
	@Column(name="cuisine_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cuisineId;
	
	@Column(name="cuisine_name")
	private String cuisineName;

	public CuisineDetails(String cuisineName) {
		super();
		this.cuisineName = cuisineName;
	}

	
	
	
}
