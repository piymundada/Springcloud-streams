package com.piyush.springcloud.streamproducer.producer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@Getter
@Setter
@EnableBinding(Source.class)
public class MessageProducer {

    private  Source source;

    public MessageProducer(Source source) {
        this.source = source;
    }
}
