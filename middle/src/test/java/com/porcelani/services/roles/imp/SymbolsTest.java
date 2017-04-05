package com.porcelani.services.roles.imp;

import org.junit.Test;
import com.porcelani.models.PasswordCharacters;

import static org.junit.Assert.assertEquals;

public class SymbolsTest { 
	
	@Test
	public void test() {
		Symbols subject = new Symbols();
		assertEquals(54, subject.rate(new PasswordCharacters("!@#$%*()-")));
		assertEquals(18, subject.rate(new PasswordCharacters("abc*12)34&5")));
	}
}