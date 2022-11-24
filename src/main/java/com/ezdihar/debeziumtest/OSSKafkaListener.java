package com.ezdihar.debeziumtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OSSKafkaListener {

    private MambuClient mambuClient;

    @Autowired
    public OSSKafkaListener(MambuClient mambuClient) {
        this.mambuClient = mambuClient;
    }

    @KafkaListener(topics = "testcorebs_v2.corebs.events", containerFactory = "kafkaListenerContainerFactory")
    public void receiveMessage(String message) {
        log.info("ANSWER FORM MAMBU: " + mambuClient.exampleGetMethod());
    }
}