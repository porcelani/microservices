package com.porcelani.services.roles.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Deductions;
import com.porcelani.services.type.Flat;

public class LettersOnly implements Deductions, Flat {

	public int rate(PasswordCharacters passwordCharacters) {
		
		if(passwordCharacters.totalNumbers() == 0)
			return -passwordCharacters.totalChars();
		return 0;
	}
}