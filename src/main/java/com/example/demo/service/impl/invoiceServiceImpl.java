package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repository.invRepositories;
import com.example.demo.service.invoiceServiceDao;

@Service
public class invoiceServiceImpl implements invoiceServiceDao {
	
	@Autowired
	private invRepositories invRepo;

	@Override
	public Invoice addInvoice(Invoice invoice) {
		Invoice inv = invRepo.save(invoice);
		return inv;
	}

	@Override
	public List<Invoice> getAllInvoices() {
		List<Invoice> invoiceList = invRepo.findAll();
		return invoiceList;
	}

	@Override
	public Invoice updateInvoice(Invoice invoice) {
		Invoice inv = invRepo.save(invoice);
		return inv;
	}

	@Override
	public Invoice deleteInvoice(int invoiceId) {
		invRepo.deleteById(invoiceId);		
		return getInvoiceByInvoiceId(invoiceId);
	}

	@Override
	public Invoice getInvoiceByInvoiceId(int invoiceId) {
		Invoice invoice = invRepo.getOne(invoiceId);
		return invoice;
	}



	

}
