package com.customer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name = "customer", schema = "customer_schema")
public class CustomerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "customer_guid")
	private String customerGuid;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name = "first_name")
	private String firstName;

	private String gender;

	@Column(name = "last_name")
	private String lastName;

	// bi-directional one-to-one association to AddressModel
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "address_guid")
	private AddressEntity addressEntity;

	// bi-directional one-to-one association to ContactModel
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_guid")
	private ContactEntity contactEntity;

	public CustomerEntity() {

	}

	public CustomerEntity(String customerGuid, Date dob, String firstName, String gender, String lastName,
			AddressEntity addressEntity, ContactEntity contactEntity) {
		super();
		this.customerGuid = customerGuid;
		this.dob = dob;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
		this.addressEntity = addressEntity;
		this.contactEntity = contactEntity;
	}

	public String getCustomerGuid() {
		return customerGuid;
	}

	public void setCustomerGuid(String customerGuid) {
		this.customerGuid = customerGuid;
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

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public ContactEntity getContactEntity() {
		return contactEntity;
	}

	public void setContactEntity(ContactEntity contactEntity) {
		this.contactEntity = contactEntity;
	}

}