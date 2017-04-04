package com.porcelani.services.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Cond;
import com.porcelani.services.type.Incr;

public class UppercaseLetters implements Additions, Cond, Incr{

	public int rate(PasswordCharacters passwordCharacters) {
		int n = passwordCharacters.totalChars() - passwordCharacters.totalUpercaseLetters();
		return n*2;
	}
}
