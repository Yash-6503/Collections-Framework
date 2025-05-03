// Program on Operations of ArrayList

package com.classes;

import java.util.*;

public class ArrayListOperations{
    public static void main(String ...args){
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(5);
        alist.add(6);
        alist.add(7);
        alist.add(8);
        alist.add(9);
        alist.add(10);
        System.out.println("List : "+alist);

        //sublist 
        System.out.println("Sublist of List : "+alist.subList(5,10));

        //contains
        System.out.println("Is List Contains 100 : "+alist.contains(100));
        System.out.println("Is List Contains 10 : "+alist.contains(10));

        //indexOf
        System.out.println("Index position of 5 in List is : "+alist.indexOf(5));

        //removeIf
        alist.removeIf((num) -> num%2==1);
        System.out.println("Even Numbers in List : "+alist);
    }
}

/* Output:
List : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Sublist of List : [6, 7, 8, 9, 10]
Is List Contains 100 : false
Is List Contains 10 : true
Index position of 5 in List is : 4
Even Numbers in List : [2, 4, 6, 8, 10]
*/