package com.day_12;

import java.util.Arrays;
import java.util.Scanner;

//How To return an array
public class Demo_04_HowToReturnAnArray {

	
	public static int[] searchAll() {
		// A method can return an array, and a func can accept an array
		int[] output = {2,4,6};
		

		return output;
		
	}
	public static void main(String[] args) {
		
		int[] arr = searchAll();
		//System.out.println(Arrays.toString(arr));// direct printing the arrays output
		
		// print array using for loops
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		
	}
}