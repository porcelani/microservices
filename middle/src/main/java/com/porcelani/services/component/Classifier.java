package com.porcelani.services.component;

import org.springframework.stereotype.Component;

import static com.porcelani.services.component.Complexity.*;

/**
 *
 */

@Component
public class Classifier {


    public Complexity command(int score) {
        if (score == 0) {
            return TOO_SHORT;
        } else if (score < 20) {
            return VERY_WEAK;
        } else if (score < 40) {
            return WEAK;
        } else if (score < 60) {
            return GOOD;
        } else if (score < 80) {
            return STRONG;
        }
        return VERY_STRONG;
    }
}
