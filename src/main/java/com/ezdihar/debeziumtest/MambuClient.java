package com.ezdihar.debeziumtest;

import reactor.core.publisher.Mono;

public interface MambuClient {

    Mono<String> exampleGetMethod();
}
