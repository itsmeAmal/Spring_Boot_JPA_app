package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
		
	@Id
	@Column(name="item_id")
	private int id;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_barcode")
	private String itemBarcode;
	
	@Column(name="item_unit")
	private String itemUnit;
	
	@Column(name="item_low_limit")
	private BigDecimal itemLowLimit;
	
	@Column(name="item_retail_price")
	private BigDecimal itemRetailPrice;
	
	@Column(name="item_category_id")
	private int itemCategory;
	
	@Column(name="item_last_purchase_price")
	private BigDecimal itemLastPurchasePrice;
	
	@Column(name="item_max_discount")
	private BigDecimal itemMaxDiscount; 
	
	@Column(name="item_brand")
	private String itemBrand;
	
	@Column(name="item_last_update_user")
	private int itemLastUpdateUser;
	
	@Column(name="item_status")
	private int status;
	
	@Column(name="item_remark")
	private String remark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemBarcode() {
		return itemBarcode;
	}
	public void setItemBarcode(String itemBarcode) {
		this.itemBarcode = itemBarcode;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	public BigDecimal getItemLowLimit() {
		return itemLowLimit;
	}
	public void setItemLowLimit(BigDecimal itemLowLimit) {
		this.itemLowLimit = itemLowLimit;
	}
	public BigDecimal getItemRetailPrice() {
		return itemRetailPrice;
	}
	public void setItemRetailPrice(BigDecimal itemRetailPrice) {
		this.itemRetailPrice = itemRetailPrice;
	}
	public int getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(int itemCategory) {
		this.itemCategory = itemCategory;
	}
	public BigDecimal getItemLastPurchasePrice() {
		return itemLastPurchasePrice;
	}
	public void setItemLastPurchasePrice(BigDecimal itemLastPurchasePrice) {
		this.itemLastPurchasePrice = itemLastPurchasePrice;
	}
	public BigDecimal getItemMaxDiscount() {
		return itemMaxDiscount;
	}
	public void setItemMaxDiscount(BigDecimal itemMaxDiscount) {
		this.itemMaxDiscount = itemMaxDiscount;
	}
	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	public int getItemLastUpdateUser() {
		return itemLastUpdateUser;
	}
	public void setItemLastUpdateUser(int itemLastUpdateUser) {
		this.itemLastUpdateUser = itemLastUpdateUser;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
