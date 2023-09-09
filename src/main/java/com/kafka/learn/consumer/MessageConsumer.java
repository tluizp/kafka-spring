package com.kafka.learn.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "transference-received", groupId = "transference-group-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
