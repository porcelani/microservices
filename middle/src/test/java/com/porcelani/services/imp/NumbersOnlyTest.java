package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.PasswordCharacters;

import static org.junit.Assert.assertEquals;

public class NumbersOnlyTest {

	@Test
	public void test() {
		NumbersOnly subject = new NumbersOnly();
		assertEquals(0, subject.rate(new PasswordCharacters("abc12345")));
		assertEquals(-5, subject.rate(new PasswordCharacters("12345")));
	}
}