package com.porcelani.services.imp;

import com.porcelani.models.Password;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Cond;
import com.porcelani.services.type.Incr;

public class UppercaseLetters implements Additions, Cond, Incr{

	public int rate(Password password) {
		int n = password.totalChars() - password.totalUpercaseLetters();
		return n*2;
	}
}
