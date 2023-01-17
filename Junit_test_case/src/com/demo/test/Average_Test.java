package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Average;



public class Average_Test {
	@Test
	public void max() {
		assertEquals(8,Average.findAvg(9,6,9));
		assertEquals(5,Average.findAvg(7,5,3));
		
	}
	}

