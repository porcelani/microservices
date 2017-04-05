package com.porcelani.services;

import com.porcelani.models.Password;
import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.component.Classifier;
import com.porcelani.services.component.DynamicFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Analyzer {

    @Autowired
    private Classifier classifier;

    @Autowired
    private DynamicFactory dynamicFactory;

    protected Password analyze(String password) {
        PasswordCharacters passwordCharacters = new PasswordCharacters(password);
        Integer score = dynamicFactory.command(passwordCharacters);
        String complexity = classifier.command(score);

        return new Password(password, score, complexity);
    }
}