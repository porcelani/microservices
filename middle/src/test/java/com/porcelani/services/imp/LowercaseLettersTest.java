package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class LowercaseLettersTest {

	@Test
	public void test() {
		UppercaseLetters subject = new UppercaseLetters();
		assertEquals(8, subject.rate(new Password("abcdABCD")));
	}
}