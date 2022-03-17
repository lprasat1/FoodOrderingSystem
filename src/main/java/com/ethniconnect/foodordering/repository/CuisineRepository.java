package com.ethniconnect.foodordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ethniconnect.foodordering.entity.ZipDetails;

public interface CuisineRepository extends JpaRepository<ZipDetails, Long>{

}
