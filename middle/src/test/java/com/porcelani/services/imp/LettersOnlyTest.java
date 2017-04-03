
package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class LettersOnlyTest {
	
	@Test
	public void test() {
		LettersOnly subject = new LettersOnly();
		assertEquals(0, subject.rate(new Password("abc12345")));
		assertEquals(-8, subject.rate(new Password("abccdefg")));
	}
}