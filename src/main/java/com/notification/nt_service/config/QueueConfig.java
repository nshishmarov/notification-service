package com.notification.nt_service.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
    
    @Value("${rabbitmq.queue.payment.name}")
    private String QUEUE_NAME;

    @Bean
    public Queue paymentQueue() {
        return new Queue(QUEUE_NAME, false);
    }
}