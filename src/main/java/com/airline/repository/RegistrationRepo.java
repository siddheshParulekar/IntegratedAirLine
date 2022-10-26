package com.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.model.User;

public interface RegistrationRepo extends JpaRepository<User, Integer> {
	public User getByEmail(String email);
	public User getByEmailAndPass(String email,String pass);

}
