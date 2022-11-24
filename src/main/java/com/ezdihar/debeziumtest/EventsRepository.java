package com.ezdihar.debeziumtest;

import org.springframework.data.repository.CrudRepository;

public interface EventsRepository extends CrudRepository<Tasks, Long> {
}
