package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class ConsecutiveNumbersTest { 
	@Test
	public void test() {
		ConsecutiveNumbers subject = new ConsecutiveNumbers();
		assertEquals(0, subject.rate(new Password("*1a2bc3DDD4C")));
		assertEquals(-6, subject.rate(new Password("1234A2A")));
	}
}