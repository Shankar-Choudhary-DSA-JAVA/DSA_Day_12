package com.day_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_10_WrapperClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        
        //primitive
        int x = 5; // x dont have behaviors

        Integer num = sc.nextInt();
        // object
        Integer y = 17; //more powerful as it contains behaviour/actions
        
        //or
        Integer p = new Integer(17); // this is how we create objects
// here we want to create integer object with the values 17
        // here line 14 and 17 are the same
        
        // here y is object/var because it has behav/methods/actions
        // Obj made through class 
        // wrapper classes add functionality to objects
        Integer z = 5;  
        //        Integer z = x; 

        // arraylist only understand data in terms ob objects
        
        // we have 8 prim data types so we have 8 wrapper classes
        ArrayList<Integer> a = new ArrayList<>();
        a.add(y);
        
        a.add(x); // Autoboxing means we convert prim datatype in to objects; .add(Integer x); automatically converted in to integer by add methods
        
        
        a.add(10);
        a.add(20);
        a.add(11);
        a.add(13);
        a.add(num);
        a.add(num);

        for(Integer i : a){
            System.out.print(i + ",");
        }
        // a.remove(5); // ? 1 index ? 1 object
System.out.println("######################");
        a.remove(z);
        while(a.contains(num)) {
            a.remove(num);
        }

        a.remove(Integer.valueOf(10));
        System.out.println();

        for(Integer i : a){
            System.out.print(i + ",");
        }
        // Wrapper
        // add
        // get
        // set/updates
        // remove
    }
}