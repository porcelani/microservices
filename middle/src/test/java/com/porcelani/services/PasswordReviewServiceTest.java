package com.porcelani.services;

import com.porcelani.models.Password;
import com.porcelani.repositories.PasswordRepository;
import com.porcelani.services.component.Classifier;
import com.porcelani.services.component.FactoryDinamica;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PasswordReviewServiceTest {

    @Spy
    private Classifier classifier;
    @Spy
    private FactoryDinamica factoryDinamica;
    @Mock
    private PasswordRepository passwordRepository;

    @InjectMocks
    private PasswordReviewService passwordReviewService;


    @Ignore
    @Test
    public void should_() {
        MockitoAnnotations.initMocks(this);

        Password review = passwordReviewService.review("simplePassword");
        Assert.assertEquals("", review);
    }
}