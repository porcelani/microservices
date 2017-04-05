package com.porcelani.services.roles.imp;

import org.junit.Test;
import com.porcelani.models.PasswordCharacters;

import static org.junit.Assert.assertEquals;

public class LowercaseLettersTest {

	@Test
	public void test() {
		UppercaseLetters subject = new UppercaseLetters();
		assertEquals(8, subject.rate(new PasswordCharacters("abcdABCD")));
	}
}