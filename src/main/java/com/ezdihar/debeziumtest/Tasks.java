package com.ezdihar.debeziumtest;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Tasks {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
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
