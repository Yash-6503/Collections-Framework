// Program on Loose Coupling of Vector to ArrayList

package com.classes;

import java.util.*;

public class LooseCouplingoOfVectorToArrayList{
    public static void main(String args[]){
        //Creating Vector Fruits Object
        Vector<String> fruits = new Vector<>();

        //Adding Fruits to Vector
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Kiwi");
        fruits.add("Mango");

        System.out.println("\nFruits in Vector : "+fruits);

        //Converting Vector to ArrayList
        ArrayList<String> al = new ArrayList<>(fruits);

        System.out.println("\nAfter Converting Vector to ArrayList Fruits are : "+al);

    }
}

/* Output:
Fruits in Vector : [Orange, Apple, Grapes, Kiwi, Mango]

After Converting Vector to ArrayList Fruits are : [Orange, Apple, Grapes, Kiwi, Mango]
*/