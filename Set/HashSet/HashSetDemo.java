// Program to perform add and retrieve operations on HashSet.

package com.classes;

import java.util.*;

public class HashSetDemo {
    public static void main(String... args) {
        
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(null);
        hs.add(30);
        hs.add(40);
        hs.add(20); // It will not accept duplicate element
        hs.add(null);   //It will accept only one null value
        hs.add(null);

        //Output will be in unsorted and unordered manner
        System.out.println("Elements available in HashSet");
        hs.forEach(System.out::println);
    }
}

/* Output.
 * Elements available in HashSet
 * null
 * 20
 * 40
 * 10
*/