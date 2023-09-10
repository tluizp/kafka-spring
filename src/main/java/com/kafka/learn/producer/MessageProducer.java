package com.kafka.learn.producer;

import com.kafka.learn.controller.Transferencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, Transferencia> kafkaTemplate;

    public void sendMessage(String topic, Transferencia message) {
        kafkaTemplate.send(topic, message);
    }
}
