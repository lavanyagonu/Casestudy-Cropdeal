package com.casestudy.repository;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.model.Farmerdetails;
public interface FarmerRepository extends MongoRepository<Farmerdetails, Integer> {



}
 