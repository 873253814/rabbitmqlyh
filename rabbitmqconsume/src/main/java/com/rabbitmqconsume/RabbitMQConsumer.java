package com.rabbitmqconsume;

import com.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import java.util.Map;

@RabbitListener(queues = {RabbitMQConfig.RABBITMQ_DEMO_TOPIC})
public class RabbitMQConsumer {
    @RabbitHandler
    public void process(Map map) {
        System.out.println("消费:" + map.toString());
    }
}
