// Program to perform all operations on LinkedHashSet

package com.classes;

import java.util.LinkedHashSet;

public class AllOperations {
    public static void main(String[] args) {
        
        // Create object of LinkedHashSet.
        LinkedHashSet<Object> lhs = new LinkedHashSet<>();

        // Add Elements into LinkedHashSet
        lhs.add("Hello");
        lhs.add(99.99);
        lhs.add(55);
        lhs.add(true);
        lhs.add(null);
        lhs.add('Y');

        // Show LinkedHashSet Elements.
        System.out.println("LinkedHashSet Elements: ");
        lhs.forEach(System.out::println);
        
        // check/search if any element is available or not
        System.out.println(lhs.contains(100) ? "\nElement 100 is available" : "\nElement 100 is not available");
        
        // remove null from set
        System.out.println(lhs.remove(null) ? "\nNull removed.." : "\nNull not Removed");
        
        // add true to set 
        System.out.println(lhs.add(true) ? "\ntrue added to Set" : "\ntrue not added to Set");
        
        // show updated LinkedHashSet elements
        System.out.println("\nLinkedHashSet updated Elements:");
        lhs.forEach(System.out::println);

    }
}

/* Output:
 * LinkedHashSet Elements:
 * Hello
 * 99.99
 * 55
 * true
 * null
 * Y
 * 
 * Element 100 is not available
 * 
 * Null removed..
 * 
 * true not added to Set
 * 
 * LinkedHashSet updated Elements:
 * Hello
 * 99.99
 * 55
 * true
 * Y
*/