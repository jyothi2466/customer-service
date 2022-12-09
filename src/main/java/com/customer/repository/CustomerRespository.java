package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.entity.CustomerEntity;
import com.customer.model.CustomerModel;

@Repository
public interface CustomerRespository extends JpaRepository<CustomerEntity, String>{
	
	public CustomerEntity findByFirstName(String firstName);

	public CustomerModel save(CustomerModel customerModel);

}
