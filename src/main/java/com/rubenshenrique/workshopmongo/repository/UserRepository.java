package com.rubenshenrique.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rubenshenrique.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	

}
