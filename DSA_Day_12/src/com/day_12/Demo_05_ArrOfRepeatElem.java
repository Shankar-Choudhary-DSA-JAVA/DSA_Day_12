package com.day_12;

import java.util.Arrays;
import java.util.Scanner;

//How To return an array
//How find occurences of an elements in the array, also find the index of the elem which are repeating

public class Demo_05_ArrOfRepeatElem {

	// if we create method for above req conditions then what will be the return
	// type of the methods

	// i want list of indices where the repeated nos. is present
	// i don't wants the counts/frequency
	
// we can iterate over an array any nos of times
	
	public static int[] searchAll(int[] arr, int elements) {
		// A method can return an array, and a func can accept an array
		
		// // we can iterate over an array any nos of times
// 1. Here in first iteration I will count the repeating elements
		int count = 0;
		for(int x : arr) {
			if(x==elements) {
				count++;
			}
			System.out.println("The count is : " +x);
		}
		// 2. now create a new array of size same as count
		
		int[] output = new int[count];
		int j=0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]== elements) {
				output[j]=i;
				j++;
			}
		}
		
		return output;
	}

	

	public static void main(String[] args) {
	//System.out.println(Arrays.toString(arr));// direct printing the arrays output
		
		// print array using for loops
	
	int arr[]= {5,6,7,2,7,3,7,4};
	int[] output = searchAll(arr, 7);
	System.out.println(Arrays.toString(output)); // it will give a new array of index, where 7 is founds
	
	
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]);
		}	
	
	}
}