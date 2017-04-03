package com.porcelani.services.imp;

import org.junit.Test;
import com.porcelani.models.Password;

import static org.junit.Assert.assertEquals;

public class NumbersTest { 
	
	@Test
	public void test(){
		Numbers subject = new Numbers();
		assertEquals(20,subject.rate(new Password("abc12345")));
	} 
}