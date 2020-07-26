package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.userServiceDao;

@RestController
public class userRestController { 
	
	@Autowired
	private userServiceDao userService;
	
	@PostMapping("/addUser")
	public User addUser(User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable int userId) {
		return userService.getUserByUserId(userId);
	} 
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}

}
