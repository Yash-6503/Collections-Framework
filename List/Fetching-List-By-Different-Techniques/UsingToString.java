//fetching List elements using toString.

package com.classes;

import java.util.*;

public class UsingToString{
    public static void main(String args[]){
        List<String> names = Arrays.asList(
            "Yash",
            "Harsh",
            "Om",
            "Ram"
        );

        System.out.println("List of Names : "+names.toString()); //use directly names instead
    }
}


/* Output:
List of Names : [Yash, Harsh, Om, Ram]
*/