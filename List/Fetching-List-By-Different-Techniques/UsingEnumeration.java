// fetching Vector elements Using Enumeration Interface
//Enumeration Interface is supporting only legacy interfaces

package com.classes;

import java.util.*;

public class UsingEnumeration{
    public static void main(String args[]){
        Vector<String> teams = new Vector<>();
        teams.add("INDIA");
        teams.add("AUSTRALIA");
        teams.add("ENGLAND");
        teams.add("SOUTH AFRICA");
        teams.add("NEWZELAND");
        

        Enumeration<String> e = teams.elements();

        System.out.print("List of Teams : [");
        while(e.hasMoreElements()){
            System.out.print(e.nextElement()+", ");
        }
        System.out.println("\b\b]");
    }
}

/* Output:
List of Teams : [INDIA, AUSTRALIA, ENGLAND, SOUTH AFRICA, NEWZELAND]
*/