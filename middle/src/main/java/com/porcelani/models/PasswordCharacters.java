package com.porcelani.models;

import java.text.Normalizer;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

/**
 * Object that know a string characteristics
 **/
public class PasswordCharacters {

    private static final String EMPTY = "";
    private static final String REGEX = "[^a-zA-Z1-9 ]";
    private String password;

    public PasswordCharacters(String password) {
        this.password = password;
    }

    public int totalChars() {
        return password.length();
    }

    public int totalNumbers() {
        int cont = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (isDigit(c)) {
                cont++;
            }
        }
        return cont;
    }

    public int totalLetters() {
        return totalChars() - totalSymbols() - totalNumbers();
    }

    public int totalUppercaseLetters() {
        int cont = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (isUpperCase(c)) {
                cont++;
            }
        }
        return cont;
    }

    public int totalLowercaseLetters() {
        return totalLetters() - totalUppercaseLetters();
    }

    public int totalSymbols() {
        String passwordWithoutSymbols = clearSymbols();
        return totalChars() - passwordWithoutSymbols.length();
    }

    public String value() {
        return password;
    }

    private String clearSymbols() {
        String text = Normalizer.normalize(password, Normalizer.Form.NFD);
        return text.replaceAll(REGEX, EMPTY);
    }


}
