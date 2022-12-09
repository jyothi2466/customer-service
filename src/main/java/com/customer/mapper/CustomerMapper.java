package com.customer.mapper;

import org.mapstruct.Mapper;

import com.customer.entity.AddressEntity;
import com.customer.entity.ContactEntity;
import com.customer.entity.CustomerEntity;
import com.customer.model.AddressModel;
import com.customer.model.ContactModel;
import com.customer.model.CustomerModel;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	public CustomerEntity modelToCustomerEntity(CustomerModel customerModel);

	public CustomerModel entityToCustomerModel(CustomerEntity customerEntity);

	public ContactEntity modelToContactEntity(ContactModel contactModel);

	public ContactModel entityToContactModel(ContactEntity contactEntity);

	public AddressEntity modelToAddressEntity(AddressModel addressModel);

	public AddressModel entityToAddressModel(AddressEntity addressEntity);
}
