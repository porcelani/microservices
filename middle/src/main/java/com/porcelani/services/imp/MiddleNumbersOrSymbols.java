package com.porcelani.services.imp;

import com.porcelani.models.Password;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Flat;

public class MiddleNumbersOrSymbols implements Additions, Flat {

	public int rate(Password password) {

		Password password2 = senhaSubsequence(password);

		return (password2.totalNumbers() + password2.totalSymbols()) * 2;
	}

	private Password senhaSubsequence(Password password) {
		String string = password.value();

		int endIndex = string.length() - 1;

		String string2 = endIndex < 3 ? "" : string.subSequence(1, endIndex).toString();
		Password password2 = new Password(string2);
		return password2;
	}

}
