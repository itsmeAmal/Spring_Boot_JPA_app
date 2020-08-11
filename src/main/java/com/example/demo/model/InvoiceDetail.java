package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice_detail") 
public class InvoiceDetail {
	
	@Id
	@Column(name="invoice_detail")
	private Integer invoiceDetailId;
	
	@Column(name="invoice_detail_invoice_no")
	private Integer invoiceId;
	
	@Column(name="invoice_detail_item_id")
	private Integer itemId;
	
	@Column(name="invoice_detail_item_qty")
	private BigDecimal itemQty;
	
	@Column(name="invoice_detail_unit")
	private String itemUnit;
	
	@Column(name="invoice_detail_unit_price")
	private BigDecimal unitPrice;
	
	@Column(name="invoice_detail_selling_price")
	private BigDecimal sellingPrice;
	
	@Column(name="invoice_detail_discount_rate")
	private BigDecimal discountRate;
	
	@Column(name="invoice_detail_purchase_price") 
	private BigDecimal purchasePrice;
		
	public InvoiceDetail(Integer invoiceDetailId, Integer invoiceId, Integer itemId, BigDecimal itemQty,
			String itemUnit, BigDecimal unitPrice, BigDecimal sellingPrice, BigDecimal discountRate,
			BigDecimal purchasePrice) {
		super();
		this.invoiceDetailId = invoiceDetailId;
		this.invoiceId = invoiceId;
		this.itemId = itemId;
		this.itemQty = itemQty;
		this.itemUnit = itemUnit;
		this.unitPrice = unitPrice;
		this.sellingPrice = sellingPrice;
		this.discountRate = discountRate;
		this.purchasePrice = purchasePrice;
	}
	@Override
	public String toString() {
		return "InvoiceDetail [invoiceDetailId=" + invoiceDetailId + ", invoiceId=" + invoiceId + ", itemId=" + itemId
				+ ", itemQty=" + itemQty + ", itemUnit=" + itemUnit + ", unitPrice=" + unitPrice + ", sellingPrice="
				+ sellingPrice + ", discountRate=" + discountRate + ", purchasePrice=" + purchasePrice + "]";
	}
	public Integer getInvoiceDetailId() {
		return invoiceDetailId;
	}
	public void setInvoiceDetailId(Integer invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}
	public Integer getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public BigDecimal getItemQty() {
		return itemQty;
	}
	public void setItemQty(BigDecimal itemQty) {
		this.itemQty = itemQty;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public BigDecimal getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
}
