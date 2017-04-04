package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.PasswordCharacters;

import static org.junit.Assert.assertEquals;

public class ConsecutiveUppercaseLettersTest { 
	
	@Test
	public void test() {
		ConsecutiveUppercaseLetters subject = new ConsecutiveUppercaseLetters();
		assertEquals(-6, subject.rate(new PasswordCharacters("*abcDDDC")));
		assertEquals(-8, subject.rate(new PasswordCharacters("AAbCCcDDD")));
		assertEquals(0, subject.rate(new PasswordCharacters("AaBaCaDa")));
	}
}