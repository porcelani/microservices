package com.porcelani.services;

import com.porcelani.models.Password;
import com.porcelani.repositories.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service call in endpoint that analyze and save the password
 */
@Service
public class PasswordReviewService {

    @Autowired
    private Analyzer analyzer;

    @Autowired
    private PasswordRepository passwordRepository;

    public Password review(String password) {
        Password passwordReviewed = analyzer.analyze(password);
        return passwordRepository.save(passwordReviewed);
    }

    public List<Password> reviews() {
        return passwordRepository.findAll();
    }
}
