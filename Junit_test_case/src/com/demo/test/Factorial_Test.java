package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Factorial_no;

public class Factorial_Test {
	@Test
	public void fact() {
		assertEquals(5040,Factorial_no.findFact(7));
		assertEquals(24,Factorial_no.findFact(4));
		
	}
	}

