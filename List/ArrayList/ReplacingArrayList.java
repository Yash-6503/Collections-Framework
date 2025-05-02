// Program to RetainAll elements from 2 Lists using ArrayList

package com.classes;

import java.util.*;

public class ReplacingArrayList{
    public static void main(String args[]){
        //List1
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Raja");
        al1.add("Majnu");
        al1.add("Male");
        al1.add("Husband");
        al1.add("Boy");
        al1.add("Transgender");
        System.out.println("List1 : "+al1);

        //List2
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Rani");
        al2.add("Laila");
        al2.add("Female");
        al2.add("Wife");
        al2.add("Girl");
        al2.add("Transgender");
        System.out.println("\nList2 : "+al2);

        //Retaining all List1 by List2 it will return matching element
        al1.retainAll(al2);
        System.out.println("\nAfter Retaining List1 by List2 : "+al1);
    }
}

/* Output:
List1 : [Raja, Majnu, Male, Husband, Boy, Transgender]

List2 : [Rani, Laila, Female, Wife, Girl, Transgender]

After Replacing List1 by List2 : [Transgender]       
*/