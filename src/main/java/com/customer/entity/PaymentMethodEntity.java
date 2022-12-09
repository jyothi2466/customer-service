package com.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the payment_method database table.
 * 
 */
@Entity
@Table(name = "payment_method", schema = "customer_schema")
public class PaymentMethodEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "payment_method_guid")
	private String paymentMethodGuid;

	@Column(name = "payment_description")
	private String paymentDescription;

	public PaymentMethodEntity() {
	}

	public String getPaymentMethodGuid() {
		return this.paymentMethodGuid;
	}

	public void setPaymentMethodGuid(String paymentMethodGuid) {
		this.paymentMethodGuid = paymentMethodGuid;
	}

	public String getPaymentDescription() {
		return this.paymentDescription;
	}

	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

}