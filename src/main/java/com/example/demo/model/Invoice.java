package com.example.demo.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice {
	
	@Id
	@Column(name="invoice_id")
	private int invoiceId;
	
	@Column(name="invoice_date")
	private Date invoiceDate;
	
	@Column(name="invoice_time")
	private Time invoiceTime;
	
	@Column(name="invoice_user_id")
	private int userId;
	
	@Column(name="invoice_total")
	private BigDecimal invoiceTotal;
	
	@Column(name="invoice_item_qty")
	private int itemQty;
	
	@Column(name="invoice_discount_rate")
	private BigDecimal discountRate;
	
	@Column(name="invoice_cust_id")
	private int customerId;
	
	@Column(name="invoice_cash_pay")
	private BigDecimal cashPay;

}
