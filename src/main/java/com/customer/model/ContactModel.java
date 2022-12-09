package com.customer.model;

public class ContactModel {
	private String contactGuid;

	private String contactType;

	private String contactValue;

	public ContactModel() {
	}

	public String getContactGuid() {
		return this.contactGuid;
	}

	public void setContactGuid(String contactGuid) {
		this.contactGuid = contactGuid;
	}

	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactValue() {
		return this.contactValue;
	}

	public void setContactValue(String contactValue) {
		this.contactValue = contactValue;
	}

}