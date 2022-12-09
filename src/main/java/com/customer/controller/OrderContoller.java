package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.OrderModel;
import com.customer.serviceimpl.OrderServiceImpl;

@RestController
@RequestMapping("/api/order/v1")
public class OrderContoller {
	@Autowired
	private OrderServiceImpl orderServiceImpl;

	@PostMapping("/create")
	public void createOrder(@RequestBody OrderModel orderModel) {
		orderServiceImpl.createOrder(orderModel);
	}

	@GetMapping("/findOrderById")
	public OrderModel findOrderById(@RequestParam("orderGuid") String orderGuid) {
		return orderServiceImpl.findOrderById(orderGuid);
	}

	@PutMapping("/updateOrderById")
	public void updateOrderById(@RequestBody OrderModel orderModel, String orderGuid) {
		orderServiceImpl.updateOrder(orderModel, orderGuid);
	}

	@DeleteMapping("/delateById")
	public void deleteOrder(@RequestParam("orderGuid") String orderGuid) {
		orderServiceImpl.deleteOrderById(orderGuid);
	}

}
