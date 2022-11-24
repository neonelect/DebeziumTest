package com.ezdihar.debeziumtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class MambuClientImpl implements MambuClient{

    @Value("${config.mambu.url}")
    private String URL;

    private WebClient webClient;

    @Autowired
    public MambuClientImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(URL).build();
    }

    @Override
    public Mono<String> exampleGetMethod() {
        return this.webClient.get().uri("/user").retrieve().bodyToMono(String.class);
    }
}
