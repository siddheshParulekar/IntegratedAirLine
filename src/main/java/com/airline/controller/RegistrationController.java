package com.airline.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airline.model.User;
import com.airline.service.RegistrationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {
	
	@Autowired
	private RegistrationService regService;
	
	@RequestMapping(value="/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmail=user.getEmail();
		if(tempEmail != null && !"".equals(tempEmail)) {
			User userObj=regService.getUserByEmail(tempEmail);
			if(userObj != null) {
				throw new Exception("User with" + tempEmail+"alreday exists");
			}
		}
		System.out.print("In registration");
		User userObj = null;
		userObj=regService.saveuser(user);
		return userObj;
	}

	@RequestMapping(value="/loginuser")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmail=user.getEmail();
		String tempPass= user.getPass();
		User userObj = null;
		if(tempEmail != null && tempPass != null) {
			userObj=regService.getUserByEmailAndPassword(tempEmail, tempPass);
		}
		if(userObj == null) {
			throw new Exception("Bad credientials");
			
		}
		return userObj;
	}
	
	
	
	@RequestMapping("/sendotp")
	public String sendOtp(@RequestParam("email") String email) {
		
		System.out.println("Email is   " + email);
		
		Random random = new Random(1000);
		int otp = random.nextInt(99999);
		
		System.out.println("otp   " + otp);
		return "verifyOtp";
	}
	
	
}
