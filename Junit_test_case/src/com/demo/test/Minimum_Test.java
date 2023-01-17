package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Minimum_no;


public class Minimum_Test {
	@Test
	public void max() {
		assertEquals(2,Minimum_no.findMin(new int[] {5,6,4,2,9}));
		assertEquals(-87,Minimum_no.findMin(new int[] {-87,-16,-67,-5,-7}));
		
	}
	}


