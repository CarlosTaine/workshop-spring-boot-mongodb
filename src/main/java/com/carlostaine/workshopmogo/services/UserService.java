package com.carlostaine.workshopmogo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlostaine.workshopmogo.domain.User;
import com.carlostaine.workshopmogo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository rep;
	
	public List<User> findAll(){
		return rep.findAll();
				
		
	}
	
}
