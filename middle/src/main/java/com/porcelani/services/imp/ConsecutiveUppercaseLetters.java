package com.porcelani.services.imp;

import com.porcelani.models.Password;
import com.porcelani.services.roles.common.Consecutive;
import com.porcelani.services.roles.Deductions;
import com.porcelani.services.type.Flat;

import static java.lang.Character.isUpperCase;

public class ConsecutiveUppercaseLetters extends Consecutive implements Deductions, Flat {

	public int rate(Password password) {
		int totalDeOcorrencias = consecutive(password.value());
		
		return -totalDeOcorrencias*2;
	}

	@Override
	protected boolean extracted(char c) {
		return isUpperCase(c);
	}

}
