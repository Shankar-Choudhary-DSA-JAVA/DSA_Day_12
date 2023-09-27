package com.day_12;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_06_ArrOfRepeatElem2 {

	
	public static int[] searchAll(int[] arr, int elements) {
	
		int count = 0;
		for(int x : arr) {
			if(x==elements) {
				count++;
			}
		}
		
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
//m2 we dont want to count the repeat elem , we directly want to store these elem in the existing arrays
	

	public static void main(String[] args) {
	//System.out.println(Arrays.toString(arr));// direct printing the arrays output
		
	
	int arr[]= {5,6,7,2,7,3,7,4};
	int[] output = searchAll(arr, 7);
	System.out.println(Arrays.toString(output)); // it will give a new array of index, where 7 is founds
	
	
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}	
	
	}
}