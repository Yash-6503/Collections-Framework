// Program to show how vector works.

package com.classes;

import java.util.*;

public class VectorDemo{
    public static void main(String args[]){
        Vector<String> listOfCities = new Vector<>();
        listOfCities.add("Pune");
        listOfCities.add("Hyderabad");
        listOfCities.add("Chennai");
        listOfCities.add("Bengalore");
        listOfCities.add("Mumbai");
        listOfCities.add("Delhi");

        System.out.println("Before sorting Cities: "+listOfCities);

        Collections.sort(listOfCities);

        System.out.println("\nAfter Sorting Cities: "+listOfCities);

        listOfCities.remove(5);
        System.out.println("\nAfter removing city on index basis: "+listOfCities);

        listOfCities.remove("Mumbai");
        System.out.println("\nAfter removing city on name basis: "+listOfCities);

        System.out.println("\nIs Chennai city is present : "+listOfCities.contains("Chennai"));

        System.out.println("\nIs Pune city is present : "+listOfCities.contains("Pune"));
    }
}

/* Output:
Before sorting Cities: [Pune, Hyderabad, Chennai, Bengalore, Mumbai, Delhi]

After Sorting Cities: [Bengalore, Chennai, Delhi, Hyderabad, Mumbai, Pune]

After removing city on index basis: [Bengalore, Chennai, Delhi, Hyderabad, Mumbai]

After removing city on name basis: [Bengalore, Chennai, Delhi, Hyderabad]

Is Chennai city is present : true

Is Pune city is present : false
*/