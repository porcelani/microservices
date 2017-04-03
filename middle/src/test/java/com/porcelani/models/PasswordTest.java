package com.porcelani.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordTest {

    @Test
    public void should_analyze_password_composition() {
        Password password = new Password("A*BCdefgh123@");

        assertEquals(13, password.totalChars());
        assertEquals(3, password.totalNumbers());
        assertEquals(8, password.totalLetters());
        assertEquals(3, password.totalUpercaseLetters());
        assertEquals(5, password.totalLowercaseLetters());
        assertEquals(2, password.totalSymbols());
    }
}