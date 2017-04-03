package com.porcelani.services.imp;

import com.porcelani.models.Password;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveLowercaseLettersTest { 
	
	@Test
	public void test() {
		ConsecutiveLowercaseLetters subject = new ConsecutiveLowercaseLetters();
		assertEquals(-4, subject.rate(new Password("*abcDDDC")));
		assertEquals(0, subject.rate(new Password("AAbCCcDDD")));
		assertEquals(-6, subject.rate(new Password("aaaaCaDa")));
	}
}