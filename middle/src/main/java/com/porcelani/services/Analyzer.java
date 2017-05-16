package com.porcelani.services;

import com.porcelani.models.Password;
import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.component.ScoreClassifier;
import com.porcelani.services.component.Complexity;
import com.porcelani.services.component.CalculatePasswordScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Analyzer {

    @Autowired
    private ScoreClassifier scoreClassifier;

    @Autowired
    private CalculatePasswordScore calculatePasswordScore;

    protected Password analyze(String password) {
        PasswordCharacters passwordCharacters = new PasswordCharacters(password);
        Integer score = calculatePasswordScore.command(passwordCharacters);
        Complexity complexity = scoreClassifier.command(score);

        return new Password(password, score, complexity.getValue());
    }
}