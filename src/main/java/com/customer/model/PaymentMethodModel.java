package com.customer.model;

public class PaymentMethodModel {

	private String paymentMethodGuid;

	private String paymentDescription;

	public PaymentMethodModel() {
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