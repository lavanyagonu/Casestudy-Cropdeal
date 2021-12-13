package com.casestudy.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.model.Admindetails;

public interface AdminRepository extends MongoRepository<Admindetails , Integer> {

}
