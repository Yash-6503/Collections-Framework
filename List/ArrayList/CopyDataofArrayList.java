// Program to copy the data of original ArrayList to duplicate ArrayList.

package com.classes;

import java.util.*;

public class CopyDataofArrayList{
    public static void main(String args[]){
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("INDIA");
        originalList.add("AUSTRALIA");
        originalList.add("ENGLAND");
        originalList.add("NEWZELAND");

        System.out.println("Original List : "+originalList);

        //copy using clone()
        @SuppressWarnings("unchecked")
        ArrayList<String> cloneList = (ArrayList<String>) originalList.clone();
        System.out.println("\nCloned List : "+cloneList);

        //copy using constructor
        ArrayList<String> duplicateList = new ArrayList<>(originalList);
        System.out.println("\nDuplicate List : "+duplicateList);

    }
}

/*
Original List : [INDIA, AUSTRALIA, ENGLAND, NEWZELAND]

Cloned List : [INDIA, AUSTRALIA, ENGLAND, NEWZELAND]

Duplicate List : [INDIA, AUSTRALIA, ENGLAND, NEWZELAND]
*/