package com.porcelani.models;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.io.Serializable;

@Table
public class Password implements Serializable {

    @PrimaryKey
    private String passwordCharacters;
    private Integer score;
    private String complexity;

    public Password() {
    }

    public Password(String passwordCharacters, Integer score, String complexity) {
        this.passwordCharacters=passwordCharacters;
        this.score = score;
        this.complexity = complexity;
    }

    public String getPasswordCharacters() {
        return passwordCharacters;
    }

    public Integer getScore() {
        return score;
    }

    public String getComplexity() {
        return complexity;
    }

}

