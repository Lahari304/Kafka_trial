package com.kafka.demo.trail.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Subscriber {
    private final Logger logger = LoggerFactory.getLogger(Subscriber.class);
    @KafkaListener(topics = "archived_docs", groupId = "archived")
    public void consume(String message){
        logger.info(String.format("$$ -> Consumed Message -> %s",message));
    }
}