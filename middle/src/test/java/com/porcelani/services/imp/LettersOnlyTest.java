
package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.PasswordCharacters;

import static org.junit.Assert.assertEquals;

public class LettersOnlyTest {
	
	@Test
	public void test() {
		LettersOnly subject = new LettersOnly();
		assertEquals(0, subject.rate(new PasswordCharacters("abc12345")));
		assertEquals(-8, subject.rate(new PasswordCharacters("abccdefg")));
	}
}