package com.ethniconnect.foodordering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ethniconnect.foodordering.api.Response;
import com.ethniconnect.foodordering.service.FoodOrderingService;



@RequestMapping
public class FoodOrderingController {
	@Autowired
	FoodOrderingService foodOrderingService;
	
	@GetMapping(path = "/getCuisines")
	public @ResponseBody String getCuisines(@PathVariable int zipCode) {
		
		foodOrderingService.save();
		
	return "saved";
	}

}
