package com.porcelani.services.roles.imp;

import com.porcelani.models.PasswordCharacters;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UppercaseLettersTest {

    @Test
    public void test() {
        UppercaseLetters subject = new UppercaseLetters();
        assertEquals(6, subject.rate(new PasswordCharacters("abcD")));
        assertEquals(8, subject.rate(new PasswordCharacters("ABCD1234")));
        assertEquals(0, subject.rate(new PasswordCharacters("jorelojlkllkl")));
    }
}