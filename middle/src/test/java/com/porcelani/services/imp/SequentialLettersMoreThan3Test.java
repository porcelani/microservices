package com.porcelani.services.imp;

import org.junit.Ignore;
import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class SequentialLettersMoreThan3Test {
	
	@Ignore
	@Test
	public void test() {
		SequentialLettersMoreThan3 subject = new SequentialLettersMoreThan3();
		assertEquals(-3, subject.rate(new Password("aBc")));
		assertEquals(-6, subject.rate(new Password("abcd")));
	}
}