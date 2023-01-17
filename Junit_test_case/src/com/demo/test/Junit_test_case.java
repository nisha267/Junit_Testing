package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.main.Junit_demo1;

public class Junit_test_case {
@BeforeClass
public static void beforec1() throws Exception {
	System.out.println("Before the class will implement");
}
@Before
public  void before()throws Exception{
	System.out.println();}
@Test
public  void max() {
	assertEquals(8,Junit_demo1.findMax(new int[] {1,3,4,2,8}));
	assertEquals(-1,Junit_demo1.findMax(new int[] {-12,-1,-3,-4,-2}));	
}
@Test
public  void findsquare() {
	assertEquals(4,Junit_demo1.square(2));}
public static void Reverse() {
	assertEquals("emoclew",Junit_demo1.reverseWord("welcome"));}
@After
public void after()throws Exception{
	System.out.println("Using after class");
}
@AfterClass
public static void afterc1()throws Exception{
	System.out.println("After the class will implement");
}	
}

