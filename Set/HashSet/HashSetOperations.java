// Program to perform HashSet basic operations.

package com.classes;

import java.util.*;

public class HashSetOperations {
    public static void main(String... args) {
        //create a HashSet object
        HashSet<Object> hs = new HashSet<>();

        //Add elements into HashSet
        hs.add("Hello");
        hs.add(50);
        hs.add(99.99);
        hs.add(true);
        hs.add(null);
        hs.add(11 + 11);
        
        //Print all elements of HashSet
        System.out.println("Elements available in HashSet");
        hs.forEach(System.out::println);
        
        //Remove Element 50
        System.out.println("\nRemove Element 50");
        hs.remove(50);
        System.out.println("After Removing element 50:");
        hs.forEach(System.out::println);

        //Search Element 99.99 in HashSet
        System.out.println("\nSearch Element 99.99");
        System.out.println(hs.contains(99.99) ? "Element is avalilable" : "Element not available");
        
        //Search Element Hii in HashSet
        System.out.println("\nSearch Element Hii");
        System.out.println(hs.contains("Hii") ? "Element is avalilable" : "Element not available");

        //Remove Element false if available in HashSet
        System.out.println("\nRemove element false if available");
        System.out.println(hs.remove(false) ? "Element deleted successfully..." : "Element not Found...");
        
    }
}

/* Output.
 * Elements available in HashSet
 * null
 * 50
 * Hello
 * 22
 * 99.99
 * true
 * 
 * Remove Element 50
 * After Removing element 50:
 * null
 * Hello
 * 22
 * 99.99
 * true
 * 
 * Search Element 99.99
 * Element is avalilable
 * 
 * Search Element Hii
 * Element not available
 * 
 * Remove element false if available
 * Element not Found...
 */