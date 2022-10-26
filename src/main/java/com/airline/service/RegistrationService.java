package com.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.model.User;
import com.airline.repository.RegistrationRepo;


@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepo regRepo;
	
	public User saveuser(User user) {
		 return regRepo.save(user);
		
	}
	
	public User getUserByEmail(String email) {
		return regRepo.getByEmail(email);
		
	}
	
	public User getUserByEmailAndPassword(String email,String pass) {
		return regRepo.getByEmailAndPass(email,pass);
		
	}
	
	
}
