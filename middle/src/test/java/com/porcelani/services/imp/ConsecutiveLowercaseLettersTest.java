package com.porcelani.services.imp;

import com.porcelani.models.PasswordCharacters;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveLowercaseLettersTest { 
	
	@Test
	public void test() {
		ConsecutiveLowercaseLetters subject = new ConsecutiveLowercaseLetters();
		assertEquals(-4, subject.rate(new PasswordCharacters("*abcDDDC")));
		assertEquals(0, subject.rate(new PasswordCharacters("AAbCCcDDD")));
		assertEquals(-6, subject.rate(new PasswordCharacters("aaaaCaDa")));
	}
}