package com.porcelani.services.imp;

import org.junit.Ignore;
import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class UppercaseLettersTest {

	@Ignore
	@Test
	public void test() {
		UppercaseLetters subject = new UppercaseLetters();
		assertEquals(6, subject.rate(new Password("abcD")));
		assertEquals(8, subject.rate(new Password("ABCD1234")));
		assertEquals(0, subject.rate(new Password("jorelojlkllkl")));
	}
}