package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Invoice;

public interface invRepositories extends JpaRepository<Invoice, Integer>{ 

}
