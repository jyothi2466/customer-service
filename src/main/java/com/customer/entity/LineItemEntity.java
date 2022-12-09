package com.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the line_item database table.
 * 
 */
@Entity
@Table(name = "line_item", schema = "customer_schema")
public class LineItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "line_item_guid")
	private String lineItemGuid;

	private double mrp;

	@Column(name = "product_guid")
	private String productGuid;

	@Column(name = "product_name")
	private String productName;

	private int quantity;

	@Column(name = "total_price")
	private double totalPrice;

	// bi-directional many-to-one association to OrderModel
	@ManyToOne
	@JoinColumn(name = "order_guid")
	private OrderEntity orderEntity;

	public LineItemEntity() {
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

	public OrderEntity getOrder() {
		return this.orderEntity;
	}

	public void setOrder(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

}