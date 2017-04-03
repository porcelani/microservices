package com.porcelani.models;

public class Answer {
    private Integer score;
    private String complexity;

    public Answer(Integer score, String complexity) {
        this.score = score;
        this.complexity = complexity;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String t) {
        this.complexity = t;
    }

}

