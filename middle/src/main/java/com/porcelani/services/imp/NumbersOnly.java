package com.porcelani.services.imp;

import com.porcelani.models.Password;
import com.porcelani.services.roles.Deductions;
import com.porcelani.services.type.Flat;

public class NumbersOnly implements Deductions, Flat{

	public int rate(Password password) {
		
		if(password.totalLetters() == 0)
			return -password.totalNumbers();
		return 0;
	}
}
