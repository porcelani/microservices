package com.porcelani.services;

import com.porcelani.models.Password;
import com.porcelani.repositories.PasswordRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
public class PasswordReviewServiceTest {

    public static final String SIMPLE_PASSWORD = "simplePassword";
    @Mock
    private Analyzer analyzer;
    @Mock
    private PasswordRepository passwordRepository;

    @InjectMocks
    private PasswordReviewService passwordReviewService;

    @Test
    public void should_verify_calls() {
        initMocks(this);

        passwordReviewService.review(SIMPLE_PASSWORD);

        verify(analyzer).analyze(SIMPLE_PASSWORD);
        verify(passwordRepository).save(any(Password.class));
    }
}