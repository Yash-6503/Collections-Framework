// Program to Merge List2 to List1 using ArrayList

package com.classes;

import java.util.*;

public class MergingArrayList{
    public static void main(String args[]){
        //List1
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Rohit");
        al1.add("Virat");
        al1.add("Sachin");
        al1.add("Rahul");
        System.out.println("List1 : "+al1);

        //List2
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Sakshi");
        al2.add("Akshada");
        al2.add("Aarya");
        al2.add("Fatima");
        System.out.println("\nList2 : "+al2);

        //Merging list2 to list1
        al1.addAll(al2);
        System.out.println("\nAfter merging lists : "+al1);
    }
}

/* Output:
List1 : [Rohit, Virat, Sachin, Rahul]

List2 : [Sakshi, Akshada, Aarya, Fatima]

After merging lists : [Rohit, Virat, Sachin, Rahul, Sakshi, Akshada, Aarya, Fatima]
*/