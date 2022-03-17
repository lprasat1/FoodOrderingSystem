package com.ethniconnect.foodordering.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="zip_master")
public class ZipDetails {	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
@Column(name="zip_code")
private int zipCode;
@Column(name="zip_desc")
private String zipDesc;

@OneToMany
private List<CuisineDetails> cuisineDetails;





}
