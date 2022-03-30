package com.ethniconnect.foodordering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/saveCuisines")
    public @ResponseBody String getCuisines() {

        foodOrderingService.save();

        return "saved";
    }

}
