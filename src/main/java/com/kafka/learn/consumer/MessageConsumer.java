package com.kafka.learn.consumer;

import com.kafka.learn.controller.Transferencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @Autowired
    private KafkaTemplate<String, Transferencia> kafkaTemplate;

    @KafkaListener(topics = "transference-received", groupId = "transference-group-id")
    public void listen(final Transferencia messageConsumer) {
        messageConsumer.setAutorizado(Boolean.TRUE);
        kafkaTemplate.send("transference-authorized", messageConsumer);
        System.out.println("Received message: " + messageConsumer);
    }
}
