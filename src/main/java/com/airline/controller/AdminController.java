package com.airline.controller;

import java.util.List;
import java.util.Optional;

import javax.naming.directory.SearchControls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airline.model.Flight;
import com.airline.repository.AdminRepository;
import com.airline.service.AdminService;

import net.bytebuddy.asm.Advice.Return;
import net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	
	@Autowired
	private AdminService service;
	private AdminRepository adminRepository;

	
	@RequestMapping("")
	public String Home()  {
		
		return "index";
	}
	
	@PostMapping("/AddFlight")
	public Flight saveFlight(@RequestBody Flight flight )  {
		Optional<Flight> ffn = service.getFlightById(flight.getFlightNo());
		if(!ffn.isPresent()) {
			return service.saveFlight(flight);
			
		}
		else {
			throw new RecordAlreadyPresentException("this flight number alredy exits");
		}
		
	}
	

	@PutMapping("/UpdateFlight/{flightNo}")
	public Flight UpdateFligt(@RequestBody Flight flight, @PathVariable("flightNo") Long flightNo) {
		if(service.getFlightById(flightNo).isPresent()) {
			return  service.saveFlight(flight);
		}
		else {
			throw new RecordAlreadyPresentException("this flight number alredy exits");
		}
		//return service.saveFlight(flight);
		
		
	}
	
	@GetMapping("/getflight/{flightNo}")
	public Optional<Flight> getByflightno(@PathVariable long flightNo) {
		return service.getFlightById(flightNo);
		
	}
	
	@GetMapping("/allflight")
	public List<Flight> getAllFilght(Flight flight){
		return service.allFilight(flight);
		
	}
	

	@DeleteMapping("/deleteFlight/{id}")
	public long deleteFlight(@PathVariable  Long id) {
		return service.deleteById(id);


	}
	@GetMapping("/search/sourceordestinationor")
	public List<Flight> search(@RequestParam String source,@RequestParam String destination ) {
		return service.findByNameOrDescriptionMethod(source,destination);
		
	}
	public class RecordAlreadyPresentException extends RuntimeException {
		public RecordAlreadyPresentException(String s) {
			super(s);
		}
	}

}
