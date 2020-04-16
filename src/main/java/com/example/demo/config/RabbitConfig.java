package com.example.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rabbitmq-server start
 * http://localhost:15672
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue myQueue() {
        return new Queue("zhong");
    }
}
