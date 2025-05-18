package com.notification.nt_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.notification.nt_service.dto.Payment;
import com.notification.nt_service.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/v1/payments")
    public List<Payment> findAllPayments() {
        return paymentService.findAllPayments();
    }

    @PostMapping("/v1/payment")
    public void postMethodName(@RequestBody Payment payment) {
        paymentService.createPayment(payment);
    }
}
