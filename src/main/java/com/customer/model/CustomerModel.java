package com.customer.model;

import java.util.Date;

public class CustomerModel {

	private String customerGuid;

	private Date dob;

	private String firstName;

	private String gender;

	private String lastName;

	private AddressModel addressModel;

	private ContactModel contactModel;

	// private List<OrderModel> orderModels;

	public CustomerModel() {
	}

	public String getCustomerGuid() {
		return customerGuid;
	}

	public void setCustomerGuid(String customerGuid) {
		this.customerGuid = customerGuid;
	}

	public AddressModel getAddressModel() {
		return addressModel;
	}

	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}

	public ContactModel getContactModel() {
		return contactModel;
	}

	public void setContactModel(ContactModel contactModel) {
		this.contactModel = contactModel;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}