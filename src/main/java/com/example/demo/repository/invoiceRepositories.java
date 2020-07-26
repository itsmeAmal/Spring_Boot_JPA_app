package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Invoice;

public interface invoiceRepositories extends JpaRepository<Invoice, Integer>{

}
