package com.porcelani.services.roles.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Cond;
import com.porcelani.services.type.Incr;

public class UppercaseLetters implements Additions, Cond, Incr {

    public int rate(PasswordCharacters passwordCharacters) {
        int upercaseLetters = passwordCharacters.totalUpercaseLetters();
        if (upercaseLetters == 0)
            return 0;

        int n = passwordCharacters.totalChars() - upercaseLetters;
        return n * 2;
    }
}
