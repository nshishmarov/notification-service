package com.notification.nt_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notification.nt_service.dto.Payment;
import com.notification.nt_service.mapper.PaymentMapper;
import com.notification.nt_service.repository.PaymentRepository;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private PaymentMapper paymentMapper;

    public List<Payment> findAllPayments() {
        return paymentRepository.findAll().stream()
            .map(entity -> paymentMapper.paymentEntityToPayment(entity))
            .toList();
    }

    public void createPayment(Payment payment) {
        var paymentEntity = paymentMapper.paymentToPaymentEntity(payment);
        paymentRepository.save(paymentEntity);
    }
}
