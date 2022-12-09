package com.customer.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.customer.entity.CustomerEntity;
import com.customer.entity.HistoryEntity;
import com.customer.entity.LineItemEntity;
import com.customer.entity.OrderEntity;
import com.customer.entity.PaymentMethodEntity;
import com.customer.entity.PaymentStatusEntity;
import com.customer.mapper.CustomerMapper;
import com.customer.mapper.OrderMapper;
import com.customer.model.HistoryModel;
import com.customer.model.LineItemModel;
import com.customer.model.OrderModel;

public class OrderUtil {

	// OrderEntityMainMethod
	static public OrderEntity mapModelToOrderEntity(OrderModel orderModel, CustomerMapper customerMapper,
			OrderMapper orderMapper) {
		OrderEntity orderEntity = orderMapper.modelToOrderEntity(orderModel);
		orderEntity.setOrderGuid(UUID.randomUUID().toString());

		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCustomerGuid(orderModel.getCustomerGuid());
		orderEntity.setCustomerEntity(customerEntity);

		orderEntity.setHistoryEntities(setHistoryEntities(orderModel.getHistoryModels(), orderEntity, orderMapper));

		orderEntity = setLineItemEntities(orderModel.getLineItemModels(), orderMapper, orderEntity);

		PaymentMethodEntity paymentMethodEntity = new PaymentMethodEntity();
		paymentMethodEntity.setPaymentMethodGuid(orderModel.getPaymentMethodGuid());
		orderEntity.setPaymentMethodEntity(paymentMethodEntity);
		
		PaymentStatusEntity paymentStatusEntity = new PaymentStatusEntity();
		paymentStatusEntity.setPaymentStatusGuid(orderModel.getPaymentStatusGuid());
		orderEntity.setPaymentStatusEntity(paymentStatusEntity);

		return orderEntity;
	}

	public static OrderEntity setLineItemEntities(List<LineItemModel> lineItemModels, OrderMapper orderMapper,
			OrderEntity orderEntity) {
		double orderPrice = 0.0;
		List<LineItemEntity> lineItemEntities = new ArrayList<>();
		for (LineItemModel lineItemModel : lineItemModels) {
			LineItemEntity lineItemEntity = orderMapper.modelToLineItemEntity(lineItemModel);
			lineItemEntity.setLineItemGuid(UUID.randomUUID().toString());
			double lineItemTotalPrice = lineItemModel.getMrp() * lineItemModel.getQuantity();
			lineItemEntity.setTotalPrice(lineItemTotalPrice);
			lineItemEntity.setOrder(orderEntity);
			lineItemEntities.add(lineItemEntity);
			orderPrice = orderPrice + lineItemTotalPrice;
		}
		System.out.println("orderPrice--->" + orderPrice);
		orderEntity.setTotalPrice(orderPrice);
		orderEntity.setLineItemEntities(lineItemEntities);
		return orderEntity;
	}

	public static List<HistoryEntity> setHistoryEntities(List<HistoryModel> historyModeles, OrderEntity orderEntity,
			OrderMapper orderMapper) {
		List<HistoryEntity> historyEntities = new ArrayList<>();

		for (HistoryModel historyModel : historyModeles) {
			HistoryEntity historyEntity = new HistoryEntity();
			historyEntity = orderMapper.modelToHistoryEntity(historyModel);
			historyEntity.setHistoryGuid(UUID.randomUUID().toString());
			historyEntity.setOrderEntity(orderEntity);
			historyEntities.add(historyEntity);
		}
		return historyEntities;
	}

	// FindMethod
	public static OrderModel mapEntityToOrderModel(OrderEntity orderEntity, OrderMapper orderMapper) {
		OrderModel orderModel = orderMapper.entityToOrderModel(orderEntity);
		orderModel.setHistoryModels(entityToHistoryModel(orderEntity.getHistoryEntities(), orderMapper, orderModel));
		orderModel.setLineItemModels(entityToLineModel(orderEntity.getLineItemEntities(), orderMapper, orderModel));

		orderModel.setCustomerGuid(orderEntity.getCustomerEntity().getCustomerGuid());
		orderModel.setPaymentMethodGuid(orderEntity.getPaymentMethodEntity().getPaymentMethodGuid());
		orderModel.setPaymentStatusGuid(orderEntity.getPaymentStatusEntity().getPaymentStatusGuid());

		return orderModel;
	}

	public static List<HistoryModel> entityToHistoryModel(List<HistoryEntity> historyEntities, OrderMapper orderMapper,
			OrderModel orderModel) {
		List<HistoryModel> historyModeles = new ArrayList<>();
		for (HistoryEntity historyEntity : historyEntities) {
			HistoryModel historyModel = new HistoryModel();
			historyModel = orderMapper.entityToHistoryModel(historyEntity);
			orderModel.setHistoryModels(historyModeles);
			historyModeles.add(historyModel);
		}
		return historyModeles;
	}

	public static List<LineItemModel> entityToLineModel(List<LineItemEntity> lineItemEntities, OrderMapper orderMapper,
			OrderModel orderModel) {
		List<LineItemModel> lineItemModeles = new ArrayList<>();
		for (LineItemEntity lineItemEntity : lineItemEntities) {
			LineItemModel lineItemModel = orderMapper.entityToLineItemModel(lineItemEntity);
			orderModel.setLineItemModels(lineItemModeles);
			lineItemModeles.add(lineItemModel);
		}
		return lineItemModeles;
	}

}
