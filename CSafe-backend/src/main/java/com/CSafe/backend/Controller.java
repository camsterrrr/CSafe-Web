package com.CSafe.backend;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
	
	/* GET MAPPINGS */
	
	@GetMapping("/about")
	public String aboutRequest() {
		return "CSafe was originally created as a CLI app written in C, but has now been updated to a Spring Boot project!"; 
	}
	
	
	/* POST MAPPINGS */
	
	@PostMapping("/new-user")
	public void newUserRequest(@RequestBody UserDTO newUser) { // Note to self, I need to create the UserDTO class.
		
	}
}
