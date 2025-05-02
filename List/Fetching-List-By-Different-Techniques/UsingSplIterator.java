// fetching List elements Using SplIterator Interface

package com.classes;

import java.util.*;

public class UsingSplIterator{
    public static void main(String args[]){
        List<String> languages = Arrays.asList(
            "Marathi",
            "Hindi",
            "English",
            "Telugu",
            "Punjabi"
        );

        Spliterator<String> sitr = languages.spliterator();

        System.out.print("List of languages : [");
        sitr.forEachRemaining(lang -> System.out.print(lang+", "));
        System.out.println("\b\b]");
    }
}

/* Output:
List of languages : [Marathi, Hindi, English, Telugu, Punjabi]
*/