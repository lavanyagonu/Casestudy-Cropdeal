package com.casestudy.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.model.Dealerdetails;

public interface DealerRepository extends MongoRepository<Dealerdetails, Integer> {
 

}
