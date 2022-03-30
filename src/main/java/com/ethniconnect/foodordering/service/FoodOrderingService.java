package com.ethniconnect.foodordering.service;

import com.ethniconnect.foodordering.entity.CuisineDetails;
import com.ethniconnect.foodordering.entity.ZipDetails;
import com.ethniconnect.foodordering.repository.CuisineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class FoodOrderingService {

	@Autowired
	CuisineRepository cuisineRepository;
	
	/* public Response getCuisines(int zipCode) {
	  
	 return cuisineRepository.findById(zipCode); 
	 
	 }*/
	
	public boolean save() {
	
		boolean isSaved=false;
		
		ZipDetails zipDetails = new ZipDetails();
		
		zipDetails.setZipCode(48307);
		zipDetails.setZipDesc("Rochester Hills");
		zipDetails.setCuisineDetails(Arrays.asList(new CuisineDetails("Americian"),
				new CuisineDetails("Mexican"),
				new CuisineDetails("Indian"),
				new CuisineDetails("Italian"),
				new CuisineDetails("Thai"),
				new CuisineDetails("Chinese"),
				new CuisineDetails("Japanese")));
		
		cuisineRepository.save(zipDetails);
		
		
		return isSaved;
	}
	 
	
	

}
