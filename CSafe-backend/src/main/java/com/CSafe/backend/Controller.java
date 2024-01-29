package com.CSafe.backend;

// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.CSafe.backend.classes.*;
import com.CSafe.backend.repositories.PasswordEntryRepository;
import com.CSafe.backend.repositories.TimestampRepository;
import com.CSafe.backend.repositories.UserRepository;
import com.CSafe.backend.DTOs.*;

@RestController
public class Controller {
	
	@Autowired
	PasswordEntryRepository passwordEntryRepository;
	
	@Autowired
	TimestampRepository timestampRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	/* GET MAPPINGS */
	
	@GetMapping("/about")
	public String aboutRequest() {
		return "CSafe was originally created as a CLI app written in C, but has now been updated to a Spring Boot project!"; 
	}
	
	
	/* POST MAPPINGS */
	
	@PostMapping("/new/user")
	public void newUserRequest(@RequestBody UserDTO newUser) { 
		
	}
	
	@PostMapping("/new/password-entry")
	public void newPasswordEntryRequest(@RequestBody PasswordEntryDTO newUser) { 
		
	}
	
	@PostMapping("/user/sign-in")
	public String userSignInRequest(@RequestParam String username, @RequestParam String plaintextPassword) {
		
		// check that username param exists and receive userObj
		User userObj = userRepository.findUserObjByUsername(username); // .orElse(null);
		
		if (userObj == null) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "No account matches that username or password!" );
		}
		
		// hash plaintextPassword param
		
		// compare hashedPassword to userObj.hashedMasterPassword
		
		// return some value
		return "{\n\t\"success\":\"Success!\"\n}";
	}
}
