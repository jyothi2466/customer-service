package com.customer.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the order database table.
 * 
 */
@Entity
@Table(name = "orders", schema = "customer_schema")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "order_guid")
	private String orderGuid;
 
	@Temporal(TemporalType.DATE)
	@Column(name = "created_date")
	private Date createdDate;

	private int quantity;
	@Column(name = "total_price")
	private double totalPrice;

	// bi-directional many-to-one association to HistoryModel
	@OneToMany(mappedBy = "orderEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<HistoryEntity> historyEntities;

	// bi-directional many-to-one association to LineItemModel
	@OneToMany(mappedBy = "orderEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<LineItemEntity> lineItemEntities;

	// bi-directional one-to-one association to CustomerModel
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_guid")
	private CustomerEntity customerEntity;

	// uni-directional one-to-one association to PaymentMethodModel
	@OneToOne
	@JoinColumn(name = "payment_method_guid")
	private PaymentMethodEntity paymentMethodEntity;

	// uni-directional one-to-one association to PaymentStatusModel
	@OneToOne
	@JoinColumn(name = "payment_status_guid")
	private PaymentStatusEntity paymentStatusEntity;

	public OrderEntity() {
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

	public List<HistoryEntity> getHistoryEntities() {
		return historyEntities;
	}

	public void setHistoryEntities(List<HistoryEntity> historyEntities) {
		this.historyEntities = historyEntities;
	}

	public List<LineItemEntity> getLineItemEntities() {
		return lineItemEntities;
	}

	public void setLineItemEntities(List<LineItemEntity> lineItemEntities) {
		this.lineItemEntities = lineItemEntities;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	public PaymentMethodEntity getPaymentMethodEntity() {
		return paymentMethodEntity;
	}

	public void setPaymentMethodEntity(PaymentMethodEntity paymentMethodEntity) {
		this.paymentMethodEntity = paymentMethodEntity;
	}

	public PaymentStatusEntity getPaymentStatusEntity() {
		return paymentStatusEntity;
	}

	public void setPaymentStatusEntity(PaymentStatusEntity paymentStatusEntity) {
		this.paymentStatusEntity = paymentStatusEntity;
	}

}