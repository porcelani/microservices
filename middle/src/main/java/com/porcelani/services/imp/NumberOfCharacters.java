package com.porcelani.services.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Flat;

public class NumberOfCharacters implements Additions, Flat {

	public int rate(PasswordCharacters passwordCharacters) {
		int n = passwordCharacters.totalChars();

		return n*4;
	}

}
