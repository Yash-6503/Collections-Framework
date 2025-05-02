// fetching List elements Using Method Reference

package com.classes;

import java.util.*;

public class UsingMethodReference{
    public static void main(String args[]){
        List<String> codingLang = Arrays.asList(
            "JAVA",
            "PYTHON",
            "JAVASCRIPT",
            "PHP",
            "NODEJS",
            "MYSQL"
        );

        System.out.println("List of Coding Languages: ");
        codingLang.forEach(System.out::println);
    }
}

/* Output:
List of Coding Languages: 
JAVA
PYTHON
JAVASCRIPT
PHP
NODEJS
MYSQL
*/