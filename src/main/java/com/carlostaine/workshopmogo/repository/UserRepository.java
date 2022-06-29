package com.carlostaine.workshopmogo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carlostaine.workshopmogo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
