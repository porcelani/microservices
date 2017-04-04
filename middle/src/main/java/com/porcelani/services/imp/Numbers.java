package com.porcelani.services.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Flat;

public class Numbers implements Additions, Flat {

	public int rate(PasswordCharacters passwordCharacters) {
		return passwordCharacters.totalNumbers()*4;
	}

}
