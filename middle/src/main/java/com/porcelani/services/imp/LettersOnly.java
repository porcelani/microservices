package com.porcelani.services.imp;

import com.porcelani.models.Password;
import com.porcelani.services.roles.Deductions;
import com.porcelani.services.type.Flat;

public class LettersOnly implements Deductions, Flat {

	public int rate(Password password) {
		
		if(password.totalNumbers() == 0)
			return -password.totalChars();
		return 0;
	}
}