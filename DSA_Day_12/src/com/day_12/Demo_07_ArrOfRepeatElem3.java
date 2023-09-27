package com.day_12;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_07_ArrOfRepeatElem3 {
//Aray is not hard,its allAbout indexing and for loops use and iterations and traversings on the array elements
	
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
	
	public static int[] searchAll2(int[] arr, int elements) {
		
		int n=arr.length;
		int[] output =new int[n+1];
		int j=0; // for output arrays
	//	for(int i=0; i<=arr.length-1; i++) { //or
			for(int i=0; i<=n-1; i++) {
             if(arr[i]==elements) {
            	// output[j]=i; // used to get all the index of 7
            	 output[j]=elements; // used to get all 7 values

            	 j++;
             }
			
		}
			output[j]=-1;//terminating the output with -1
			// -1 is a technique to terminates the array
		return output;
		
	}

	

	public static void main(String[] args) {
	//System.out.println(Arrays.toString(arr));// direct printing the arrays output
		
	
	int arr[]= {5,6,7,2,7,3,7,4};
	int[] output = searchAll(arr, 7);
	System.out.println(Arrays.toString(output)); // it will give a new array of index, where 7 is founds
	
	
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}	
		
		System.out.println("##############################3");
		//m2 ka output
		
	output=searchAll2(arr, 7);
	for(int j=0; output[j]!=-1; j++) {
		System.out.print(output[j] + ",");
	}
		
	
	}
}