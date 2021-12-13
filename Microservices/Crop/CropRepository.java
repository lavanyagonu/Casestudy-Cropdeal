package com.casestudy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.model.Cropdetails;


public interface CropRepository extends MongoRepository<Cropdetails, Integer> {







}