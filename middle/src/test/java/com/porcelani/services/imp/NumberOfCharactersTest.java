package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class NumberOfCharactersTest {

	@Test
	public void test() {
		NumberOfCharacters subject = new NumberOfCharacters();
		assertEquals(32, subject.rate(new Password("abc12345")));
	}
}