package com.kafka.demo.trail.controller;

import com.kafka.demo.trail.services.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/archive")
public class Controller {
    private final Publisher producer;
    @Autowired
    public Controller(Publisher producer) {
        this.producer = producer;
    }
    @GetMapping
    public void sendMessageToKafkaTopic(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }
}