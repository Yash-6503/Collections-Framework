// fetching List elements Using ListIterator Interface
// ListIterator can retrieve elements in both directions.

package com.classes;

import java.util.*;

public class UsingListIterator{
    public static void main(String args[]){
        List<String> trains = Arrays.asList(
            "Ajanta Express",
            "Devgiri Express",
            "Chennai Express",
            "Vande Bharat Express",
            "Rajdhani Express",
            "Shatabdi Express",
            "Tejas Express"
        );

        ListIterator itr = trains.listIterator();

        System.out.print("List of Trains in forward direction : \n[");
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println("\b\b]");

        System.out.print("\nList of Trains in backward direction : \n[");
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+", ");
        }
        System.out.println("\b\b]");
    }
}

/* Output:
List of Trains in forward direction : 
[Ajanta Express, Devgiri Express, Chennai Express, Vande Bharat Express, Rajdhani Express, Shatabdi Express, Tejas Express]

List of Trains in backward direction :
[Tejas Express, Shatabdi Express, Rajdhani Express, Vande Bharat Express, Chennai Express, Devgiri Express, Ajanta Express]
*/