package com.day_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_13_ArrayListUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int N = sc.nextInt();
        //reading the arraylist
        for(int i=1; i<=N; i++){
            Integer num = sc.nextInt();
            arr.add(num);
        }
        //printing the arraylist
        for(Integer x:arr){  // int also supports while printing
            System.out.println(x);
        }
    }
}