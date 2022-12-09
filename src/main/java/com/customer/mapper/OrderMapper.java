package com.customer.mapper;

import org.mapstruct.Mapper;

import com.customer.entity.HistoryEntity;
import com.customer.entity.LineItemEntity;
import com.customer.entity.OrderEntity;
import com.customer.entity.PaymentMethodEntity;
import com.customer.entity.PaymentStatusEntity;
import com.customer.model.HistoryModel;
import com.customer.model.LineItemModel;
import com.customer.model.OrderModel;
import com.customer.model.PaymentMethodModel;
import com.customer.model.PaymentStatusModel;

@Mapper(componentModel = "spring")
public interface OrderMapper {

	public OrderEntity modelToOrderEntity(OrderModel orderModel);

	public OrderModel entityToOrderModel(OrderEntity orderEntity);

	public HistoryEntity modelToHistoryEntity(HistoryModel historyModel);

	public HistoryModel entityToHistoryModel(HistoryEntity historyEntity);

	public LineItemEntity modelToLineItemEntity(LineItemModel lineItemModel);

	public LineItemModel entityToLineItemModel(LineItemEntity lineItemEntity);

	public PaymentMethodEntity modelToPaymentMethodEntity(PaymentMethodModel PaymentMethodModel);

	public PaymentMethodModel entityToPaymentMethodModel(PaymentMethodEntity paymentMethodEntity);

	public PaymentStatusEntity modelToPaymentStatusEntity(PaymentStatusModel paymentStatusModel);

	public PaymentStatusModel entityToPaymentStatusEntity(PaymentStatusEntity paymentStatusEntity);

}
