package com.porcelani.services.roles.imp;

import org.junit.Test;
import com.porcelani.models.PasswordCharacters;

import static org.junit.Assert.assertEquals;

public class NumberOfPasswordCharactersTest {

	@Test
	public void test() {
		NumberOfCharacters subject = new NumberOfCharacters();
		assertEquals(32, subject.rate(new PasswordCharacters("abc12345")));
	}
}