// Program to print in Ascending and Descending order.

package com.classes;

import java.util.*;

public class AscendingDescendingList{
    public static void main(String ...args){
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hyderabad");
        cities.add("Pune");
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Chennai");

        System.out.println("List of Cities : "+cities);

        //Sorting list in Ascending order
        Collections.sort(cities);
        System.out.println("\nAfter Sorting Cities in Ascending Order: "+cities);

        //Sorting list in Descending order
        Collections.sort(cities, Collections.reverseOrder());
        System.out.println("\nAfter Sorting Cities in Descending Order: "+cities);
        
    }
}

/* Output:
List of Cities : [Hyderabad, Pune, Bangalore, Mumbai, Chennai]

After Sorting Cities in Ascending Order: [Bangalore, Chennai, Hyderabad, Mumbai, Pune]

After Sorting Cities in Descending Order: [Pune, Mumbai, Hyderabad, Chennai, Bangalore]
*/