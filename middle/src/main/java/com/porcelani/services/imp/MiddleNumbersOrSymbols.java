package com.porcelani.services.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Flat;

public class MiddleNumbersOrSymbols implements Additions, Flat {

	public int rate(PasswordCharacters passwordCharacters) {

		PasswordCharacters passwordCharacters2 = senhaSubsequence(passwordCharacters);

		return (passwordCharacters2.totalNumbers() + passwordCharacters2.totalSymbols()) * 2;
	}

	private PasswordCharacters senhaSubsequence(PasswordCharacters passwordCharacters) {
		String string = passwordCharacters.value();

		int endIndex = string.length() - 1;

		String string2 = endIndex < 3 ? "" : string.subSequence(1, endIndex).toString();
		PasswordCharacters passwordCharacters2 = new PasswordCharacters(string2);
		return passwordCharacters2;
	}

}
