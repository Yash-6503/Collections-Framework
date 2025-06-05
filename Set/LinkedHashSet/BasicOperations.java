// Program to perform basic operations on LinkedHashSet.

package com.classes;

import java.util.LinkedHashSet;

public class BasicOperations {
    public static void main(String[] args) {
        //create a object of LinkedHashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        //Add elements to LinkedHashSet
        lhs.add(10);
        lhs.add(30);
        lhs.add(40);
        lhs.add(null);
        lhs.add(20);
        lhs.add(50);

        //Retrieve Elements from LinkedHashSet.
        System.out.println("LinkedHashSet Elements : ");
        lhs.forEach(System.out::println);
    }
}

/* 
 * LinkedHashSet basically it is used to maintain order of set
*/

/* Output:
 * LinkedHashSet Elements :
 * 10
 * 30
 * 40
 * null
 * 20
 * 50
 */