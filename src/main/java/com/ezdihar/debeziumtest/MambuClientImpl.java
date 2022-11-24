package com.ezdihar.debeziumtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MambuClientImpl implements MambuClient{

    @Value("${config.mambu.url}")
    private String URL;


    @Override
    public String exampleGetMethod() {

        RestTemplate restTemplate = new RestTemplate();

      return restTemplate.getForEntity(URL + "/user", String.class).getBody();
    }
}
