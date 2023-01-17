package com.demo.test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.demo.main.EvenOdd;


public class EvenOdd_test {
	@Test
	public void max() {
		assertTrue(EvenOdd.findEvenOdd(8));
		assertFalse(EvenOdd.findEvenOdd(7));
		
	}
	}

