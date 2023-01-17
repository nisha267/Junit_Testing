package com.demo.main;

public class Minimum_no {
	public static int findMin(int[]arr) {
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
	}


