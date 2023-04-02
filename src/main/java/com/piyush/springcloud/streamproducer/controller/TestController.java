package com.piyush.springcloud.streamproducer.controller;

import com.piyush.springcloud.streamproducer.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final MessageProducer messageProducer;

    @Autowired
    public TestController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }


    @PostMapping(value = "/sendMessage/string")
    public String publishMessageString(@RequestBody String payload) {
        messageProducer.getSource()
                .output()
                .send(MessageBuilder.withPayload(payload)
                        .setHeader("type", "String")
                        .build());
        return "Success";
    }
}
