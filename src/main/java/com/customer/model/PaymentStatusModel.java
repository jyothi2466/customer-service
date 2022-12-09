package com.customer.model;

public class PaymentStatusModel {

	private String paymentStatusGuid;

	private String paymentDescription;

	public PaymentStatusModel() {
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