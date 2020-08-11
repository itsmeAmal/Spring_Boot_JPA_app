package com.example.demo.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="invoice_payment")
public class InvoicePayment {
		
	@Column(name="invoice_payment_id")
	private int Id;
	
	@Column(name="invoice_payment_date")
	private Date Date;
	
	@Column(name="invoice_payment_total")
	private BigDecimal Total;
	
	@Column(name="invoice_payment_discount_rate")
	private BigDecimal DiscountRate;
	
	@Column(name="invoice_payment_discount_value")
	private BigDecimal DiscountValue;
	
	@Column(name="invoice_payment_cash")
	private BigDecimal Cash;
	
	@Column(name="invoice_payment_discounted_total")
	private BigDecimal DiscountedTotal;
	
	@Column(name="invoice_payment_invoice_no")
	private int InvoiceNo;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public BigDecimal getTotal() {
		return Total;
	}
	public void setTotal(BigDecimal total) {
		Total = total;
	}
	public BigDecimal getDiscountRate() {
		return DiscountRate;
	}
	public void setDiscountRate(BigDecimal discountRate) {
		DiscountRate = discountRate;
	}
	public BigDecimal getDiscountValue() {
		return DiscountValue;
	}
	public void setDiscountValue(BigDecimal discountValue) {
		DiscountValue = discountValue;
	}
	public BigDecimal getCash() {
		return Cash;
	}
	public void setCash(BigDecimal cash) {
		Cash = cash;
	}
	public BigDecimal getDiscountedTotal() {
		return DiscountedTotal;
	}
	public void setDiscountedTotal(BigDecimal discountedTotal) {
		DiscountedTotal = discountedTotal;
	}
	public int getInvoiceNo() {
		return InvoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		InvoiceNo = invoiceNo;
	}
	
}
