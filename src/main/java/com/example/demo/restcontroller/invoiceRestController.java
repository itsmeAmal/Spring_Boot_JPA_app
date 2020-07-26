package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Invoice;
import com.example.demo.service.invoiceServiceDao;

@RestController
public class invoiceRestController {
	
	@Autowired
	private invoiceServiceDao invoiceService;
	
	@PostMapping("/addInvoice")
	public Invoice addInvoice(Invoice invoice) {
		return invoiceService.addInvoice(invoice);
	}
	
	@GetMapping("/getAllInvoices")
	public List<Invoice> getAllInvoices(){
		return invoiceService.getAllInvoices();
	}
	
	

}
