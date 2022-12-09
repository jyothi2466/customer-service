package com.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the payment_status database table.
 * 
 */
@Entity
@Table(name = "payment_status", schema = "customer_schema")
public class PaymentStatusEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "payment_status_guid")
	private String paymentStatusGuid;

	@Column(name = "payment_description")
	private String paymentDescription;

	public PaymentStatusEntity() {
	}

	public String getPaymentStatusGuid() {
		return this.paymentStatusGuid;
	}

	public void setPaymentStatusGuid(String paymentStatusGuid) {
		this.paymentStatusGuid = paymentStatusGuid;
	}

	public String getPaymentDescription() {
		return this.paymentDescription;
	}

	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

}