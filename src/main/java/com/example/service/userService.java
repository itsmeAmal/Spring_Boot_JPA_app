package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.example.model.User;

@Component
public class userService {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	EntityManager em = emf.createEntityManager();
	
	public User addUser(User user) {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();		
		return user;
	}
	
	public User getUserByUserId(int userId) {
		User user = em.find(User.class, userId);
		return user;
	}
	
	public User deleteUserByUserId(int userId) {
		User user = em.find(User.class, userId);
		em.remove(user); 
		return user;
	}
	
	

}
