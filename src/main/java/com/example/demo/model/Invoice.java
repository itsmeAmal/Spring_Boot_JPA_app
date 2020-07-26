package com.example.demo.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

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
	private Timestamp invoiceDate;
	
	@Column(name="invoice_time")
	private Timestamp invoiceTime;
	
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
	
	public Invoice() {} 

	public Invoice(int invoiceId, Timestamp invoiceDate, Timestamp invoiceTime, int userId, BigDecimal invoiceTotal, int itemQty,
			BigDecimal discountRate, int customerId, BigDecimal cashPay) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.invoiceTime = invoiceTime;
		this.userId = userId;
		this.invoiceTotal = invoiceTotal;
		this.itemQty = itemQty;
		this.discountRate = discountRate;
		this.customerId = customerId;
		this.cashPay = cashPay;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", invoiceTime=" + invoiceTime
				+ ", userId=" + userId + ", invoiceTotal=" + invoiceTotal + ", itemQty=" + itemQty + ", discountRate="
				+ discountRate + ", customerId=" + customerId + ", cashPay=" + cashPay + "]";
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Timestamp getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Timestamp getInvoiceTime() {
		return invoiceTime;
	}

	public void setInvoiceTime(Timestamp invoiceTime) {
		this.invoiceTime = invoiceTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public BigDecimal getInvoiceTotal() {
		return invoiceTotal;
	}

	public void setInvoiceTotal(BigDecimal invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public BigDecimal getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getCashPay() {
		return cashPay;
	}

	public void setCashPay(BigDecimal cashPay) {
		this.cashPay = cashPay;
	}
	
}
