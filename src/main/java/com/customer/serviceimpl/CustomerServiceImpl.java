package com.customer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.CustomerEntity;
import com.customer.mapper.CustomerMapper;
import com.customer.model.CustomerModel;
import com.customer.repository.CustomerRespository;
import com.customer.service.CustomerService;
import com.customer.util.CustomerUtil;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private CustomerRespository customerRespository;

	@Override
	public void createCustomer(CustomerModel customerModel) {
		CustomerEntity customerEntity = CustomerUtil.createCustomerEntity(customerMapper, customerModel);
		customerRespository.save(customerEntity);
	}

	@Override
	public CustomerModel findCustomerByFirstName(String firstName) {		
		 return CustomerUtil.entityToCustomerModel(customerRespository.findByFirstName(firstName),customerMapper);
	}
	
	@Override
	public void updateCustomer(CustomerModel customerModel) {
		CustomerEntity customerEntity = CustomerUtil.createCustomerEntity(customerMapper, customerModel);
		customerRespository.save(customerEntity);
	}

	@Override
	public void deleteById(String customerGuid) {
		customerRespository.deleteById(customerGuid);
	}
}
