package com.day_12;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_01_shiftAndInserts_02_copy {

	public static void main(String[] args) {
//index = position+1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array sizes: ");
		int n = sc.nextInt(); // what size of array you want
		
		int arr[] =new int[n+1]; // size of array is n+1 we are creating/created
		
		
		for(int i =0; i<n; i++) {
			
			arr[i] = sc.nextInt();
			 
		}
		
		System.out.println(Arrays.toString(arr)); 
	
		System.out.println(" on which position we want to insert the new elem:"); 

		int pos=sc.nextInt();  // on which position we want to insert the new elem

		System.out.println(" what is the value of of new ele you want to insert:"); 

		int y = sc.nextInt();	
		
		for(int i=n-1; i>=pos-1; i--) {
			// i=n-1 means second last se shifting start karo
			// i = pos-1 tak jao taki o position khali ho jaye jaha new elements insert karni hai
			
			
			
			// agle index par pichhle elements ko insert kar denge
			arr[i+1]=arr[i]; // arr[i+1] it will hold arr[i] elements	
			}
		
		System.out.println(Arrays.toString(arr)); 

		
		arr[pos-1]=y; // at arr[pos-1] we wanted to insert y, y is an elements
		System.out.println(Arrays.toString(arr)); 
	}

}
