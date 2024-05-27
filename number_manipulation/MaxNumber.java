package com.coding;

import java.util.Arrays;

public class MaxNumber {

	public static void main(String[] args) {
		
		/*
		 * int[] arr = {10,5,8,2,4,7} ; int maxElement = findMaxElement(arr) ;
		 * System.out.println(maxElement);
		 */
		
		int [] arr = new int[] {24, 56, 72, 32, 46};
		
		int max = Arrays.stream(arr).max().getAsInt() ;
		System.out.println(max);
		
	}
	
	public static int findMaxElement(int[] arr) {
		return Arrays.stream(arr).max().getAsInt() ;
		
	}

}

