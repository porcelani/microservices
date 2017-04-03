package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class NumbersOnlyTest {

	@Test
	public void test() {
		NumbersOnly subject = new NumbersOnly();
		assertEquals(0, subject.rate(new Password("abc12345")));
		assertEquals(-5, subject.rate(new Password("12345")));
	}
}