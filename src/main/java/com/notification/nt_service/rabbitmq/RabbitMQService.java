package com.notification.nt_service.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
public class RabbitMQService {

    private final RabbitTemplate rabbitTemplate;
    @Value("${rabbitmq.queue.payment.name:payment-queue}")
    private String MESSAGE_QUEUE;

    public RabbitMQService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(MESSAGE_QUEUE, message);
    }
}
