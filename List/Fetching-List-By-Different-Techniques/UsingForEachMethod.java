//fetching list elements using ForEach() Method

package com.classes;

import java.util.*;

public class UsingForEachMethod{
    public static void main(String args[]){
        List<Object> random = Arrays.asList(
            "JAVA",
            599.32,
            'A',
            true,
            100
        );

        System.out.print("List of Objects: [");
        random.forEach(obj -> System.out.print(obj+", "));
        System.out.println("\b\b]");
    }
}

/* Output:
List of Objects: [JAVA, 599.32, A, true, 100]   
*/