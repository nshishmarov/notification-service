package com.notification.nt_service.mapper;

import org.mapstruct.Mapper;

import com.notification.nt_service.domain.PaymentEntity;
import com.notification.nt_service.dto.Payment;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    Payment paymentEntityToPayment(PaymentEntity paymentEntity);
    PaymentEntity paymentToPaymentEntity(Payment payment);
}