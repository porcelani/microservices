package com.porcelani.services.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Deductions;
import com.porcelani.services.type.Flat;

public class NumbersOnly implements Deductions, Flat{

	public int rate(PasswordCharacters passwordCharacters) {
		
		if(passwordCharacters.totalLetters() == 0)
			return -passwordCharacters.totalNumbers();
		return 0;
	}
}
