package com.example.appealsservice.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface KafkaProcessor {

    @Output
    MessageChannel output1();

    @Output
    MessageChannel output2();
}
