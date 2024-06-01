package com.kafka.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, Transferencia> messageProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestBody Transferencia message) {
        messageProducer.send("transference-received", message);
        return "Message sent: " + message;
    }
}
