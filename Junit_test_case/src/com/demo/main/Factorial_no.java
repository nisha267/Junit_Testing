package com.demo.main;

public class Factorial_no {
	public static long findFact(int num) {
		long fact=1;
			for(int i=2;i<=num;i++)	{
				fact*=i;
				
			}
			return fact;
		
	}
	}

