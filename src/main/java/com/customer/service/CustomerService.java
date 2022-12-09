package com.customer.service;

import com.customer.model.CustomerModel;

public interface CustomerService {
	
	public void createCustomer(CustomerModel customerModel);
		
	public void updateCustomer(CustomerModel customerModel);
	
	public CustomerModel findCustomerByFirstName(String firstName);
	
	public void deleteById(String customerGuid);

}
