package com.customer.model;

import java.util.Date;
import java.util.List;

public class OrderModel {

	private String orderGuid;

	private Date createdDate;
	private int quantity;
	private double totalPrice;

	private List<HistoryModel> historyModels;

	private List<LineItemModel> lineItemModels;

	private String customerGuid;

	private String paymentMethodGuid;

	private String paymentStatusGuid;

	public OrderModel() {
	}

	public String getOrderGuid() {
		return orderGuid;
	}

	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<HistoryModel> getHistoryModels() {
		return historyModels;
	}

	public void setHistoryModels(List<HistoryModel> historyModels) {
		this.historyModels = historyModels;
	}

	public List<LineItemModel> getLineItemModels() {
		return lineItemModels;
	}

	public void setLineItemModels(List<LineItemModel> lineItemModels) {
		this.lineItemModels = lineItemModels;
	}

	public String getCustomerGuid() {
		return customerGuid;
	}

	public void setCustomerGuid(String customerGuid) {
		this.customerGuid = customerGuid;
	}

	public String getPaymentMethodGuid() {
		return paymentMethodGuid;
	}

	public void setPaymentMethodGuid(String paymentMethodGuid) {
		this.paymentMethodGuid = paymentMethodGuid;
	}

	public String getPaymentStatusGuid() {
		return paymentStatusGuid;
	}

	public void setPaymentStatusGuid(String paymentStatusGuid) {
		this.paymentStatusGuid = paymentStatusGuid;
	}

}