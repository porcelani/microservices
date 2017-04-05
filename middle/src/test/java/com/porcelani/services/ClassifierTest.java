package com.porcelani.services;

import com.porcelani.services.component.Classifier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassifierTest {

    @Test
    public void should_classifier_password() {

        Classifier classifier = new Classifier();
        assertEquals("Too Short", classifier.command(0));
        assertEquals("Very Weak", classifier.command(10));
        assertEquals("Very Weak", classifier.command(15));
        assertEquals("Weak", classifier.command(20));
        assertEquals("Weak", classifier.command(30));
        assertEquals("Good", classifier.command(40));
        assertEquals("Good", classifier.command(50));
        assertEquals("Strong", classifier.command(60));
        assertEquals("Strong", classifier.command(70));
        assertEquals("Very Strong", classifier.command(80));
        assertEquals("Very Strong", classifier.command(90));
    }
}