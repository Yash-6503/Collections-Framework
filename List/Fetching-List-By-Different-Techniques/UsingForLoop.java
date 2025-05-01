package com.classes;

import java.util.*;

public class UsingForLoop{
    public static void main(String args[]){
        List<String> fruits = Arrays.asList("Orange","Apple","Kiwi","Grapes");

        System.out.println("List of Fruits");
        for(int i=0; i<fruits.size(); i++){
            System.out.print(fruits.get(i)+", ");
        }
    }
}

/* Output
List of Fruits
Orange, Apple, Kiwi, Grapes
*/