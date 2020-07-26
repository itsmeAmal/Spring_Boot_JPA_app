package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Invoice;

public interface invoiceServiceDao {
	
	public Invoice addInvoice(Invoice invoice);
	
	public List<Invoice> getAllInvoices();
	
	public Invoice updateInvoice(Invoice invoice);
	
	public Invoice deleteInvoice(int invoiceId);
	
	public Invoice getInvoiceByInvoiceId(int invoiceId);

}
