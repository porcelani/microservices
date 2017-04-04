package com.porcelani.services;

import com.porcelani.services.component.Classifier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassifierTest {

    @Test
    public void should_classifier_password() {

        Classifier classifier = new Classifier();
        assertEquals("Too Short", classifier.executa(0));
        assertEquals("Very Weak", classifier.executa(10));
        assertEquals("Very Weak", classifier.executa(15));
        assertEquals("Weak", classifier.executa(20));
        assertEquals("Weak", classifier.executa(30));
        assertEquals("Good", classifier.executa(40));
        assertEquals("Good", classifier.executa(50));
        assertEquals("Strong", classifier.executa(60));
        assertEquals("Strong", classifier.executa(70));
        assertEquals("Very Strong", classifier.executa(80));
        assertEquals("Very Strong", classifier.executa(90));
    }
}