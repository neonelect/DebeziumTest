package com.ezdihar.debeziumtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DebeziumController {

    @Autowired
    private EventsRepository eventsRepository;

    @PostMapping("/push")
    @ResponseStatus(HttpStatus.OK)
    public void pushToDB(@RequestBody String text){
        Tasks task = new Tasks();
        task.setText(text);

        eventsRepository.save(task);
    }
}
