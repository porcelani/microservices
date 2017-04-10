package com.porcelani;

import com.porcelani.services.component.CalculatePasswordScore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotEquals;

/**
 * Validate @Scope("prototype")
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatePasswordScoreIT {


    @Autowired
    private CalculatePasswordScore calculatePasswordScore1;

    @Autowired
    private CalculatePasswordScore calculatePasswordScore2;

    @Test
    public void should_create_more_than_one_object() {
        assertNotEquals(calculatePasswordScore1,calculatePasswordScore2);
    }
}