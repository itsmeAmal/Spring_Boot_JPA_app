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
	
	@Column(name="item_code")
	private String itemCode;
	
	@Column(name="item_barcode")
	private String barcode;
	
	@Column(name="item_reorder_level")
	private int reorderLevel;
	
	@Column(name="item_status_1")
	private String status_1;
	
	@Column(name="item_status_2")
	private BigDecimal status_2;
	
	@Column(name="item_status_3")
	private int status_3;
	
	@Column(name="item_selling_price")
	private BigDecimal sellingPrice;
	
	@Column(name="item_category")
	private String categoryName;
	
	@Column(name="item_sub_category")
	private String subCategoryName;
	
	@Column(name="item_purchasing_price")
	private BigDecimal purchasingPrice;
	
	@Column(name="item_brand")
	private String itemBrand;
	
	@Column(name="item_category_id")
	private int categoryId;
	
	@Column(name="item_last_purchase_price")
	private BigDecimal itemLastPurchasePrice;
	
	@Column(name="item_last_update_user")
	private int lastUpdatedUserId;
	
	@Column(name="item_low_limit")
	private BigDecimal lowLimit;
	
	@Column(name="item_max_discount")
	private BigDecimal maxDiscount;
	
	@Column(name="item_retail_price")
	private BigDecimal retailPrice;
	
	@Column(name="item_unit")
	private String unit;
	
	@Column(name="item_remark")
	private String remark;
	
	@Column(name="item_status")
	private int status;
		
	public Item(int id, String itemName, String itemCode, String barcode, int reorderLevel, String status_1,
			BigDecimal status_2, int status_3, BigDecimal sllingPrice, String categoryName, String subCategoryName,
			BigDecimal purchasingPrice, String itemBrand, int categoryId, BigDecimal itemLastPurchasePrice,
			int lastUpdatedUserId, BigDecimal lowLimit, BigDecimal maxDiscount, BigDecimal retailPrice, String unit,
			String remark, int status) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemCode = itemCode;
		this.barcode = barcode;
		this.reorderLevel = reorderLevel;
		this.status_1 = status_1;
		this.status_2 = status_2;
		this.status_3 = status_3;
		this.sellingPrice = sllingPrice;
		this.categoryName = categoryName;
		this.subCategoryName = subCategoryName;
		this.purchasingPrice = purchasingPrice;
		this.itemBrand = itemBrand;
		this.categoryId = categoryId;
		this.itemLastPurchasePrice = itemLastPurchasePrice;
		this.lastUpdatedUserId = lastUpdatedUserId;
		this.lowLimit = lowLimit;
		this.maxDiscount = maxDiscount;
		this.retailPrice = retailPrice;
		this.unit = unit;
		this.remark = remark;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemCode=" + itemCode + ", barcode=" + barcode
				+ ", reorderLevel=" + reorderLevel + ", status_1=" + status_1 + ", status_2=" + status_2 + ", status_3="
				+ status_3 + ", sllingPrice=" + sellingPrice + ", categoryName=" + categoryName + ", subCategoryName="
				+ subCategoryName + ", purchasingPrice=" + purchasingPrice + ", itemBrand=" + itemBrand
				+ ", categoryId=" + categoryId + ", itemLastPurchasePrice=" + itemLastPurchasePrice
				+ ", lastUpdatedUserId=" + lastUpdatedUserId + ", lowLimit=" + lowLimit + ", maxDiscount=" + maxDiscount
				+ ", retailPrice=" + retailPrice + ", unit=" + unit + ", remark=" + remark + ", status=" + status + "]";
	}
	
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
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public int getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	public String getStatus_1() {
		return status_1;
	}
	public void setStatus_1(String status_1) {
		this.status_1 = status_1;
	}
	public BigDecimal getStatus_2() {
		return status_2;
	}
	public void setStatus_2(BigDecimal status_2) {
		this.status_2 = status_2;
	}
	public int getStatus_3() {
		return status_3;
	}
	public void setStatus_3(int status_3) {
		this.status_3 = status_3;
	}
	public BigDecimal getSllingPrice() {
		return sellingPrice;
	}
	public void setSllingPrice(BigDecimal sllingPrice) {
		this.sellingPrice = sllingPrice;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	public BigDecimal getPurchasingPrice() {
		return purchasingPrice;
	}
	public void setPurchasingPrice(BigDecimal purchasingPrice) {
		this.purchasingPrice = purchasingPrice;
	}
	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public BigDecimal getItemLastPurchasePrice() {
		return itemLastPurchasePrice;
	}
	public void setItemLastPurchasePrice(BigDecimal itemLastPurchasePrice) {
		this.itemLastPurchasePrice = itemLastPurchasePrice;
	}
	public int getLastUpdatedUserId() {
		return lastUpdatedUserId;
	}
	public void setLastUpdatedUserId(int lastUpdatedUserId) {
		this.lastUpdatedUserId = lastUpdatedUserId;
	}
	public BigDecimal getLowLimit() {
		return lowLimit;
	}
	public void setLowLimit(BigDecimal lowLimit) {
		this.lowLimit = lowLimit;
	}
	public BigDecimal getMaxDiscount() {
		return maxDiscount;
	}
	public void setMaxDiscount(BigDecimal maxDiscount) {
		this.maxDiscount = maxDiscount;
	}
	public BigDecimal getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
