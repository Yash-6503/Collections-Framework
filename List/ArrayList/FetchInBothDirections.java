// Program to Fetch elements in Both (Forward + Backward) directions.

package com.classes;

import java.util.*;

public class FetchInBothDirections{
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(300,400,200,500,100);
        System.out.println("List : "+list);

        //sorting
        Collections.sort(list);
        System.out.println("\nAfter Sorting : "+list);

        //Fetching in Forward direction.
        ListIterator itr = list.listIterator();
        System.out.print("\nElements in Forward Direction: \n[");
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println("\b\b]");

        //Fetching in Backward direction.
        System.out.print("\nElements in Backward Direction: \n[");
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+", ");
        }
        System.out.println("\b\b]");
    }
}

/* Output:
List : [300, 400, 200, 500, 100]

After Sorting : [100, 200, 300, 400, 500]       

Elements in Forward Direction:
[100, 200, 300, 400, 500]

Elements in Backward Direction:
[500, 400, 300, 200, 100]
*/