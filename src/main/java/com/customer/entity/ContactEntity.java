package com.customer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the contact database table.
 * 
 */
@Entity
@Table(name = "contact", schema = "customer_schema")
public class ContactEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "contact_guid")
	private String contactGuid;

	@Column(name = "contact_type")
	private String contactType;

	@Column(name = "contact_value")
	private String contactValue;

	public ContactEntity() {
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