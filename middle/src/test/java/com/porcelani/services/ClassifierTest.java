package com.porcelani.services;

import com.porcelani.services.component.Classifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassifierTest {

    private Classifier classifier;

    @Before
    public void setUp() {
        classifier = new Classifier();
    }

    @Test
    public void should_classifier_password() {
        assertEquals("Too Short", getComplexity(0));
        assertEquals("Very Weak", getComplexity(10));
        assertEquals("Very Weak", getComplexity(15));
        assertEquals("Weak", getComplexity(20));
        assertEquals("Weak", getComplexity(30));
        assertEquals("Good", getComplexity(40));
        assertEquals("Good", getComplexity(50));
        assertEquals("Strong", getComplexity(60));
        assertEquals("Strong", getComplexity(70));
        assertEquals("Very Strong", getComplexity(80));
        assertEquals("Very Strong", getComplexity(90));
    }

    private String getComplexity(int score) {
        return classifier.command(score).getValue();
    }
}