package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.example.model.User;

@Component
public class userService {
	
	public User addUser(User user) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();		
		return user;
	}
	
	public User getUserByUserId(int userId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		User user = em.find(User.class, userId);
		return user;
	}
	
	public User deleteUserByUserId(int userId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		User user = em.find(User.class, userId);
		em.remove(user); 
		return user;
	}
	
}
