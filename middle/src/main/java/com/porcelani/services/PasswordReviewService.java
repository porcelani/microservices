package com.porcelani.services;

import com.porcelani.models.Password;
import com.porcelani.models.PasswordCharacters;
import com.porcelani.repositories.PasswordRepository;
import com.porcelani.services.component.Classifier;
import com.porcelani.services.component.FactoryDinamica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordReviewService {

    @Autowired
    private Classifier classifier;

    @Autowired
    private FactoryDinamica factoryDinamica;

    @Autowired
    private PasswordRepository passwordRepository;

    public Password review(String password) {
        PasswordCharacters passwordNotReviewed = new PasswordCharacters(password);

        Integer executa = factoryDinamica.executa(passwordNotReviewed);
        String complexity = classifier.executa(executa);

        Password passwordReviewed = new Password(password, executa, complexity);
        Password passwordSaved = passwordRepository.save(passwordReviewed);
        return passwordSaved;
    }

    public List<Password> reviews() {
        return passwordRepository.findAll();
    }
}
