package com.example.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {


   private Logger LOG = LoggerFactory.getLogger(KafkaProducer.class);
    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer (KafkaTemplate<String,String> kafkaTemplate){
    this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        LOG.info(String.format("hey message is %s",message));
        kafkaTemplate.send("product", message);
    }



}
