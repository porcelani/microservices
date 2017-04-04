package com.porcelani.services.imp;

import com.porcelani.models.PasswordCharacters;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleNumbersOrSymbolsTest { 
	@Test
	public void test() {
		MiddleNumbersOrSymbols subject = new MiddleNumbersOrSymbols();
		assertEquals(0, subject.rate(new PasswordCharacters("1")));
		assertEquals(0, subject.rate(new PasswordCharacters("1$")));
		assertEquals(2, subject.rate(new PasswordCharacters("19abc$")));
		assertEquals(14, subject.rate(new PasswordCharacters("abc*12)34&5")));
		assertEquals(0, subject.rate(new PasswordCharacters("jorelojlkllkl")));
	}
}