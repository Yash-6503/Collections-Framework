// Program of String Operations on ArrayList

package com.classes;

import java.util.*;

public class StringOpreationsOnArrayList{
    public static void main(String args[]){
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Hyderabad");
        cities.add("Kolkata");
        cities.add("Chennai");
        cities.add("Koti");

        System.out.println("List of cities : "+cities);

        //startswith()
        System.out.print("Cities names starts with K : [");
        cities.forEach((list) -> {
            if(list.startsWith("K")){
                System.out.print(list+", ");
            }
        });
        System.out.println("\b\b]");

        //removeif
        cities.removeIf(str -> str.startsWith("K"));
        System.out.println("After removing Cities : "+cities);
    }
}

/* Output:
List of cities : [Pune, Hyderabad, Kolkata, Chennai, Koti]
Cities names starts with K : [Kolkata, Koti] 
After removing Cities : [Pune, Hyderabad, Chennai]
*/