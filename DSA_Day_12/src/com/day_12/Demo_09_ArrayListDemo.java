package com.day_12;

// Package where
import java.util.ArrayList;
import java.util.Iterator;

public class Demo_09_ArrayListDemo {
    public static void main(String[] args) {

        // Creating ArrayList objects
    	// <> it says what kind of data you wanted to store in the ArrayList objects
      //  ArrayList<Integer> arrList = new ArrayList<>();

        ArrayList<Integer> arrList = new ArrayList<>();
        // for better perfor use default size as 0
        // we can set the initial capacity as 10, and then it will 
        //automatically double its size for more than 10 elements

      //  arrList.ensureCapacity(100);// here we are saying ki arraylist should have 100 cqpacity minimum,maxm is our choice
        
        arrList.add(10);
        arrList.add(20);
        arrList.add(90);
        arrList.add(100);
        
        // insert elements in the middle of the arraylists, 
        //its very easy not like arrays, where we write so many codes for the same thongs
        arrList.add(0,5);
        
        // update
        arrList.set(1,12);

        arrList.remove(3); // 90 will be removed , dhyan se output observed karo
        
        // get all 
        //we can direct print the arraylist but not the arrays
        System.out.println("getting all elements: "+arrList);
        
        
        // get particular index
    //    System.out.println(arrList[4]);// it does not support like arrays

        System.out.println(arrList.get(0)); // use get method on array lists
        System.out.println(arrList.get(1));
        System.out.println(arrList.get(2));

        // iterate over the arraylist using forEach loops to get/fetch all elements from list one by one and then print it
        //for each loops
        for(Integer x : arrList){
            System.out.print(x + ",");
        }
        // another way
        System.out.println();

        // using for loops
        for(int i=0; i<arrList.size(); i++){ // array has .lingth method, but arraylist has .size() methods
            System.out.print(arrList.get(i) + ",");
        }
        
        
       
        // Get the iterator to iterate over the loops
        Iterator<Integer> it = arrList.iterator();//iterator is a arraylist methods
      //  # Iterator only supports collections not the Array
        // Print the first item
      // System.out.println("Using Iterators first elements only: "+it.next());
        
        //        // Print the all items

        while(it.hasNext()) {
        	  System.out.println("Using Iterators all elements : "+it.next());
        	}
        

        
        Iterator<Integer> itF = arrList.iterator();//iterator is a arraylist methods

        for( ;itF.hasNext(); ) {
        	System.out.print("Using for :" +itF.next() + ",");
        }
        

        // arrList.trimToSize(100);// using this we can limit the capacity of the array lists
        
        
        
        
        
        
    }
}