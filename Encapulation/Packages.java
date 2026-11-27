
package Encapulation;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


// we can addd like this one by one which we need or else we can direclty import the whole package in java
import java.util.*;


public class Packages {
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<>();
        l.add(88);
        System.out.println(l);
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        System.out.println(arr);
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the deigit");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("hello");

    }

}