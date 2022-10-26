package com.airline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.model.Flight;



public interface AdminRepository extends JpaRepository<Flight, Long> {
	public List<Flight> findBySourceOrDestinatin(String source, String destinatin);
}
