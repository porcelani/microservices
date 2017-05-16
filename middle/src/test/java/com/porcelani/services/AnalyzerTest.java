package com.porcelani.services;

import com.porcelani.models.Password;
import com.porcelani.services.component.ScoreClassifier;
import com.porcelani.services.component.CalculatePasswordScore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static java.lang.Integer.valueOf;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AnalyzerTest {
    private static final String SIMPLE_PASSWORD = "simple";

    @Spy
    private ScoreClassifier scoreClassifier;
    @Spy
    private CalculatePasswordScore calculatePasswordScore;

    @InjectMocks
    private Analyzer analyzer;

    @Test
    public void should_validate_analyzed() {
        Password review = analyzer.analyze(SIMPLE_PASSWORD);

        assertEquals(SIMPLE_PASSWORD, review.getPasswordCharacters());
        assertEquals(valueOf(8), review.getScore());
        assertEquals("Very Weak", review.getComplexity());
    }
}