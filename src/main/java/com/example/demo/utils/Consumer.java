package com.example.demo.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 定义消息队列消费者
 */
@Component
@RabbitListener(queues = "zhong")
@Slf4j
public class Consumer {
    /**
     * 指定消息的处理方法
     * @param message
     */
    @RabbitHandler
    public void process(String message) {
        log.info("接受的消息为：" + message);
    }
}
