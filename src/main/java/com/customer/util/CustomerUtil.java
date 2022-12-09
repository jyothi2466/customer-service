package com.customer.util;

import java.util.UUID;

import com.customer.entity.AddressEntity;
import com.customer.entity.ContactEntity;
import com.customer.entity.CustomerEntity;
import com.customer.mapper.CustomerMapper;
import com.customer.model.CustomerModel;

public class CustomerUtil {
	public static CustomerEntity createCustomerEntity(CustomerMapper customerMapper, CustomerModel customerModel) {
	
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity = customerMapper.modelToCustomerEntity(customerModel);
	
		if (customerEntity.getCustomerGuid().isEmpty()) {
			customerEntity.setCustomerGuid(UUID.randomUUID().toString());
		}

		AddressEntity addressEntity = customerMapper.modelToAddressEntity(customerModel.getAddressModel());
		if (addressEntity.getAddressGuid().isEmpty()) {
			addressEntity.setAddressGuid(UUID.randomUUID().toString());
		}
		customerEntity.setAddressEntity(addressEntity);

		ContactEntity contactEntity = customerMapper.modelToContactEntity(customerModel.getContactModel());
		if (contactEntity.getContactGuid().isEmpty()) {
			contactEntity.setContactGuid(UUID.randomUUID().toString());
		}
		customerEntity.setContactEntity(contactEntity);
		// customerEntity.setOrderEntities(customerMapper.modelToOrderEntity(CustomerUtil.setOrderEntities(null,
		// null)));
		return customerEntity;
	}

	

	public static CustomerModel entityToCustomerModel(CustomerEntity customerEntity, CustomerMapper customerMapper) {
		CustomerModel customerModel = customerMapper.entityToCustomerModel(customerEntity);
		customerModel.setAddressModel(customerMapper.entityToAddressModel(customerEntity.getAddressEntity()));
		customerModel.setContactModel(customerMapper.entityToContactModel(customerEntity.getContactEntity()));
		return customerModel;
	}

	/*
	 * public static PaymentMethodEntity setPaymentMethodEntity(PaymentMethodModel
	 * paymentMethodModel, OrderMapper orderMapper) { PaymentMethodEntity
	 * paymentMethodEntity =
	 * orderMapper.modelToPaymentMethodEntity(paymentMethodModel); return
	 * paymentMethodEntity; }
	 * 
	 * public static PaymentStatusEntity setPaymentStatusEntity(PaymentStatusModel
	 * paymentStatusModel, OrderMapper orderMapper) { PaymentStatusEntity
	 * paymentStatusEntity =
	 * orderMapper.modelToPaymentStatusEntity(paymentStatusModel); return
	 * paymentStatusEntity;
	 * 
	 * }
	 */
	/*
	 * public static List<OrderEntity> setOrderEntities(List<OrderModel>
	 * orderModels, OrderMapper orderMapper) { List<OrderEntity> orderEntities = new
	 * ArrayList<>(); for (OrderModel orderModel : orderModels) { OrderEntity
	 * orderEntity = new OrderEntity();
	 * orderEntity.setOrderGuid(UUID.randomUUID().toString()); orderEntity =
	 * orderMapper.modelToOrderEntity(orderModel); orderEntities.add(orderEntity); }
	 * return orderEntities; }
	 */
}
