package com.customer.model;

public class LineItemModel {
	private String lineItemGuid;

	private double mrp;

	private String productGuid;

	private String productName;

	private int quantity;

	private double totalPrice;

	public LineItemModel() {
	}

	public String getLineItemGuid() {
		return this.lineItemGuid;
	}

	public void setLineItemGuid(String lineItemGuid) {
		this.lineItemGuid = lineItemGuid;
	}

	public double getMrp() {
		return this.mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public String getProductGuid() {
		return this.productGuid;
	}

	public void setProductGuid(String productGuid) {
		this.productGuid = productGuid;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}