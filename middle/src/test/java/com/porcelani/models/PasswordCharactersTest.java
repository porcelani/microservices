package com.porcelani.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordCharactersTest {

    @Test
    public void should_analyze_password_composition() {
        PasswordCharacters passwordCharacters = new PasswordCharacters("A*BCdefgh123@");

        assertEquals(13, passwordCharacters.totalChars());
        assertEquals(3, passwordCharacters.totalNumbers());
        assertEquals(8, passwordCharacters.totalLetters());
        assertEquals(3, passwordCharacters.totalUppercaseLetters());
        assertEquals(5, passwordCharacters.totalLowercaseLetters());
        assertEquals(2, passwordCharacters.totalSymbols());
    }
}