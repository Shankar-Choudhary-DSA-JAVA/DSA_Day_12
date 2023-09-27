package com.day_12;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_02_deletesAndInserts3 {

	public static void main(String[] args) {

		//10. delete and inserts me bhi same logics hoga , we need to shift and and then insert
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

		int y = sc.nextInt();		for(int i=n-1; i>=pos-1; i--) {
			arr[i+1]=arr[i]; // arr[i+1] it will hold arr[i] elements	
			}
		
		System.out.println(Arrays.toString(arr)); 

		
		arr[pos-1]=y; // at arr[pos-1] we wanted to insert y, y is ant elements
		System.out.println(Arrays.toString(arr)); 
	}

}
