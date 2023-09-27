package com.day_12;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_01_ShiftAndInserts {

	public static void main(String[] args) {

		// insertion and deletion of an element from the array , so we will create an array of size n+1
		// where one places will be empty, to store the new elements
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array sizes: ");
		int n = sc.nextInt(); // what size of array you want
		
		// insert the ele in the  array later
		int arr[] =new int[n+1]; // size of array is n+1 we are creating/created
		
		
      // read the array(n) elements	from users and putting in to the array
		// means harek ndex pe we rae putting the elements
		for(int i =0; i<n; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		// print the array elements
		
		System.out.println(Arrays.toString(arr)); //it returns string representations of the array
		// Arrays.toString is used to print the array directly without for loop
		// to string represen of elements can be print directly
		
		// another way to print using for loops
		
		for(int i=0; i<=n; i++) {
			System.out.println("Print all elements using for loops: "+ arr[i]);
		}
	
		//		// another way to print using for each loops
for(int x : arr) {
	System.out.println("Using for Each loops : "+x);
	
}
		
		
		
		// Now I need to do shifting  first and then we will do insertions
		System.out.println(" on which position we want to insert the new elem:"); 

		int pos=sc.nextInt();  // on which position we want to insert the new elem

		System.out.println(" what is the value of of new ele you want to insert:"); 

		int y = sc.nextInt();  // what is the value of of new ele you want to insert

		// write shifting logics
		for(int i=n-1; i>=pos-1; i--) { // pos= n-1 , as index starts from 0
			arr[i+1]=arr[i]; // arr[i+1] it will hold arr[i] elements	
			}
		
		System.out.println(Arrays.toString(arr)); 

		
	// now write the logics so that we can overwrite the new elements at the position where we want to insert
		arr[pos-1]=y; // at arr[pos-1] we wanted to insert y, y is an elements
		System.out.println(Arrays.toString(arr)); 
	}

}
