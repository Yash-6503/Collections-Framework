//fetching List elements using foreach loop

package com.classes;

import java.util.*;

public class UsingForEachLoop{
    public static void main(String args[]){
        List<String> cities = new ArrayList<String>();

        cities.add("Pune");
        cities.add("Chennai");
        cities.add("Banglore");
        cities.add("Hyderabad");
        cities.add("Mumbai");

        System.out.println("List of cities");
        for(String city : cities){
            System.out.print(city+", ");
        }
    }
}

/* Output
List of cities
Pune, Chennai, Banglore, Hyderabad, Mumbai
*/