package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.userRepositories;
import com.example.demo.service.userServiceDao;

@Service
public class userServiceImpl implements userServiceDao{
	
	@Autowired
	private userRepositories userRepositories;

	@Override 
	public List<User> getAllUsers() {
		List<User> userList = userRepositories.findAll();
		return userList;
	}

	@Override
	public User addUser(User user) {
		userRepositories.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		if(user.getId() != 0) {
			userRepositories.save(user);
		}
		return user;
	}

	@Override
	public User deleteUser(int userId) {
		userRepositories.deleteById(userId);
		User user = userRepositories.getOne(userId);
		return user;
	}

	@Override
	public User getUserByUserId(int userId) {
		User user = userRepositories.getOne(userId); 
		return user;
	}

}
