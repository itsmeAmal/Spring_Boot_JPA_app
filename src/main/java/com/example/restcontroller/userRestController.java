package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.userService;

@RestController
public class userRestController { 
	
	@Autowired
	private userService userService;
	
	@PostMapping("/addUser")
	public User addUser(User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable int userId) {
		return userService.getUserByUserId(userId);
	} 

}
