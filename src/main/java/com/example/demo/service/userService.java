package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface userService {
	
	public List<User> getAllUsers();
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public User deleteUser(int userId); 
	
	public User getUserByUserId(int userId);

}
