package com.customer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the history database table.
 * 
 */
@Entity
@Table(name="history",schema = "customer_schema")
public class HistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="history_guid")
	private String historyGuid;

	@Temporal(TemporalType.DATE)
	@Column(name="purchase_date")
	private Date purchaseDate;

	//bi-directional many-to-one association to OrderModel
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="order_guid")
	private OrderEntity orderEntity;

	public HistoryEntity() {
	}

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

	public String getHistoryGuid() {
		return this.historyGuid;
	}

	public void setHistoryGuid(String historyGuid) {
		this.historyGuid = historyGuid;
	}

	public Date getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public OrderEntity getOrder() {
		return this.orderEntity;
	}

	public void setOrder(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

}