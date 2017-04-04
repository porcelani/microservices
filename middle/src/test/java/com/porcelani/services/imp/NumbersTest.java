package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.PasswordCharacters;

import static org.junit.Assert.assertEquals;

public class NumbersTest { 
	
	@Test
	public void test(){
		Numbers subject = new Numbers();
		assertEquals(20,subject.rate(new PasswordCharacters("abc12345")));
	} 
}