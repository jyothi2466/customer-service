package com.customer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.OrderEntity;
import com.customer.mapper.CustomerMapper;
import com.customer.mapper.OrderMapper;
import com.customer.model.OrderModel;
import com.customer.repository.OrderRepository;
import com.customer.service.OrderService;
import com.customer.util.OrderUtil;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void createOrder(OrderModel orderModel) {
		OrderEntity orderEntity = OrderUtil.mapModelToOrderEntity(orderModel, customerMapper, orderMapper);
		orderRepository.save(orderEntity);

	}

	@Override
	public OrderModel findOrderById(String orderGuid) {
		return OrderUtil.mapEntityToOrderModel(orderRepository.findById(orderGuid).get(), orderMapper);

	}

	@Override
	public void deleteOrderById(String orderGuid) {
		orderRepository.deleteById(orderGuid);
	}

	@Override
	public void updateOrder(OrderModel orderModel) {
		OrderEntity orderEntity = OrderUtil.mapModelToOrderEntity(orderModel, customerMapper, orderMapper);
		orderRepository.save(orderEntity);
	}

	@Override
	public void updateOrder(OrderModel orderModel, String orderGuid) {
		OrderModel orderModel1 = orderMapper.entityToOrderModel(orderRepository.findById(orderGuid).get());
		OrderEntity orderEntity = OrderUtil.mapModelToOrderEntity(orderModel1, customerMapper, orderMapper);
		orderRepository.save(orderEntity);
	}
}