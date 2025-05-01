//fetching List elements using Iterator interface

package com.classes;

import java.util.*;

public class UsingIterator{
    public static void main(String args[]){
        List<String> cars = Arrays.asList(
            "Scorpio",
            "Thar",
            "Creata",
            "Swift",
            "Curv.ev"
        );

        Iterator itr = cars.iterator();
        System.out.print("List of Cars: [");
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println("\b\b]");
    }
}

/* Output:
List of Cars: [Scorpio, Thar, Creata, Swift, Curv.ev]
*/