package com.porcelani.services.roles.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Flat;

public class Symbols implements Additions, Flat {

	public int rate(PasswordCharacters passwordCharacters) {
		int totalSymbols = passwordCharacters.totalSymbols();
		return totalSymbols*6;
	}

}
