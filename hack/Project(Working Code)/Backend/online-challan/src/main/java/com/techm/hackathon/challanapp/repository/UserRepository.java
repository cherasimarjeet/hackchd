package com.techm.hackathon.challanapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techm.hackathon.challanapp.domain.AppUser;
import com.techm.hackathon.challanapp.request.UserLoginRequest;

@Repository
public interface UserRepository extends CrudRepository<AppUser,Long>{	
	
}
