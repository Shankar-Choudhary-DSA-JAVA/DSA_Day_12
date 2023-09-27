package com.day_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_11_WrapperClasses2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
 

        Integer num = sc.nextInt();
        
        //primitive
        int x = 5; //int x dont have behaviors/actions/methods
       // Integer z = 5;  //or
         Integer z=x;

        // object
        Integer y = 17; //more powerful as it contains behaviour/actions
        
        //or
 //       Integer p = new Integer(17); // this is how we create objects
// here we want to create integer object with the values 17
        // here line 18 and 21 are the same
        
        // here y is object/var because it has behav/methods/actions
        // Obj made through class 
        // wrapper classes add functionality to objects
        // arraylist only understand data in terms ob objects
        
        // we have 8 prim data types so we have 8 wrapper classes
        ArrayList<Integer> a = new ArrayList<>();
        a.add(y);
        
        a.add(x); //Autoboxing means we convert prim datatype in to objects; .add(Integer x); automatically converted in to integer by add methods
        
        
        a.add(10);
        a.add(20);
        a.add(11);
        a.add(13);
        a.add(17);

        a.add(27);
        a.add(28);
        a.add(37);
a.add(num);
        a.add(num);
        for(Integer i : a){
            System.out.print(i + ",");
        }
      System.out.println("######################");

     // a.remove(5); // ? 1 index ? 1 object; here 5 is simple int data types
       // a.remove(13); // here it does not supports objects removals, because here 13 is int prim dat types
        a.remove(2); //it can remove elem as well as index data
//        System.out.println(a);
        for(Integer i : a){
            System.out.print(i + ",");
        }

        
        System.out.println("*******************");
        
      
    

        
        // how to remove actual values
        a.remove(Integer.valueOf(13)); // it will actually remove the actual values/objects
        // or 
        a.remove(z);
        
        a.remove(num);
        
//       Integer p= a.remove(Integer.compare(13, 17)); // it will actually remove the actual values/objects
//       System.out.println(p);
        System.out.println();

        for(Integer i : a){
            System.out.print(i + ",");
        }
        
        // i i want remove any particular elem which is repeating
        while(a.contains(num)) {
            a.remove(num);
        }
        System.out.println("******************");
        System.out.println(a);
        // with array list concepts you should know these below concepts
        // Wrapper
        // add
        // get
        // set/updates
        // remove
    }
}