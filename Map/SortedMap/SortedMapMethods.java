// Program to work on SortedMap Methods.

import java.util.*;

public class SortedMapMethods {
    public static void main(String[] args) {

        SortedMap<Integer, String> sm = new TreeMap<>();
        sm.put(104, "Ajay");
        sm.put(102, "Harsh");
        sm.put(101, "Umesh");
        sm.put(105, "Suresh");
        sm.put(103, "Vijay");

        System.out.println("Map Elements : ");
        sm.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

        System.out.println("First Key : " + sm.firstKey());
        System.out.println("Last Key : " + sm.lastKey());
        System.out.println("Head elements : " + sm.headMap(103)); // keys before 103
        System.out.println("Tail elements : " + sm.tailMap(104)); //keys after 104 including itself
        System.out.println("Sub elements : " + sm.subMap(103, 105)); // keys from 103 to 104 because 105 is exclusive

    }
}

/*
 * Map Elements :
 * Key : 101, Value : Umesh
 * Key : 102, Value : Harsh
 * Key : 103, Value : Vijay
 * Key : 104, Value : Ajay
 * Key : 105, Value : Suresh
 * First Key : 101
 * Last Key : 105
 * Head elements : {101=Umesh, 102=Harsh}
 * Tail elements : {104=Ajay, 105=Suresh}
 * Sub elements : {103=Vijay, 104=Ajay}
*/
