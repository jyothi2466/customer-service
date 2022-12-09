package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.CustomerModel;
import com.customer.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/api/customer/v1")
public class CustomerController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@PostMapping("/create")
	public void createCustomer(@RequestBody CustomerModel customerModel) {
		customerServiceImpl.createCustomer(customerModel);
	}

	@GetMapping("/findbyfirstname")
	public CustomerModel findCustomerByFirstName(@RequestParam("firstName") String firstName) {
		CustomerModel customerModel = customerServiceImpl.findCustomerByFirstName(firstName);
		return customerModel;
	}

	@PutMapping("/update")
	public void updateCustomer(@RequestBody CustomerModel customerModel) {
		customerServiceImpl.updateCustomer(customerModel);
	}

	@DeleteMapping("/deleteById{customerGuid}")
	public void deleteById(@PathVariable("customerGuid") String customerGuid) {
		customerServiceImpl.deleteById(customerGuid);
	}
}
