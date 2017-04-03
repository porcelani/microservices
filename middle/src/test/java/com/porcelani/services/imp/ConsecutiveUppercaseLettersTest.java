package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class ConsecutiveUppercaseLettersTest { 
	
	@Test
	public void test() {
		ConsecutiveUppercaseLetters subject = new ConsecutiveUppercaseLetters();
		assertEquals(-6, subject.rate(new Password("*abcDDDC")));
		assertEquals(-8, subject.rate(new Password("AAbCCcDDD")));
		assertEquals(0, subject.rate(new Password("AaBaCaDa")));
	}
}