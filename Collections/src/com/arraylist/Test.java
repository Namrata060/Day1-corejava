package com.arraylist;

import java.util.Arrays;

public class Test {
	
	public static void main(String[]args) {
		int[]arr= {23,2,27,14,32,53};
		
		System.out.println("The original array is: ");
		
		for(int num:arr) {
			System.out.println(num + " ");
			
		}
		
		Arrays.sort(arr);
		System.out.println("\n the sorted array is: ");
		for (int num :arr) {
			System.out.println(num+ "");
		}
	}

}
