package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class SymbolsTest { 
	
	@Test
	public void test() {
		Symbols subject = new Symbols();
		assertEquals(54, subject.rate(new Password("!@#$%*()-")));
		assertEquals(18, subject.rate(new Password("abc*12)34&5")));
	}
}