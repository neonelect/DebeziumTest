package com.ezdihar.debeziumtest;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Tasks {

    @Id
    private Long id;

    private String text;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
