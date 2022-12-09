package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.entity.OrderEntity;
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String> {
	 
	//public OrderEntity findOrderById(String orderGuid);
	
}
