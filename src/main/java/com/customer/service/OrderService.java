package com.customer.service;

import com.customer.model.OrderModel;

public interface OrderService {
	public void createOrder(OrderModel orderModel);

	public void updateOrder(OrderModel orderModel,String orderGuid);

	public OrderModel findOrderById(String orderGuid);

	public void deleteOrderById(String orderGuid);
	
	public void updateOrder(OrderModel orderModel);
	
	
}
