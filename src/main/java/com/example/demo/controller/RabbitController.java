package com.example.demo.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息队列发送类
 */
@RestController
public class RabbitController {
    @Autowired
    AmqpTemplate rabbitmqTemplate;      //AmqpTemplate接口定义了发送和接收消息的基本操作,目前spring官方也只集成了Rabbitmq一个消息队列

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String send(String msg) {
        //发送消息
        rabbitmqTemplate.convertAndSend("zhong", msg);
        return "消息:" + msg + "已发送";
    }
}
