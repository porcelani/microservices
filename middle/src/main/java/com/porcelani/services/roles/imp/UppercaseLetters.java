package com.porcelani.services.roles.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Cond;
import com.porcelani.services.type.Incr;

public class UppercaseLetters implements Additions, Cond, Incr {

    public int rate(PasswordCharacters passwordCharacters) {
        int uppercaseLetters = passwordCharacters.totalUppercaseLetters();
        if (uppercaseLetters == 0)
            return 0;

        int n = passwordCharacters.totalChars() - uppercaseLetters;
        return n * 2;
    }
}
