package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface userRepositories extends JpaRepository<User, Integer> {

}
