package com.piyush.springcloud.streamproducer.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class MessageConsumer {

    @StreamListener(target = Sink.INPUT)
    public void consume(String message){
        System.out.println("Received a message : " + message);
    }
}
