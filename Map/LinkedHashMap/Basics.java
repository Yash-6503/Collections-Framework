// Basics of LinkedHashMap
/*
 * LinkedHashMap maintains insertion order because it uses Doubly Linked List.
 * Slow in nature than HashMap
 * If We want to fetch the elements in the same order as they were inserted in the Map then we should go with LinkedHashMap.
*/

package Map.LinkedHashMap;

import java.util.LinkedHashMap;

public abstract class Basics {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(103, "John");
        lhm.put(105, "Allen");
        lhm.put(101, "Smith");
        lhm.put(104, "Mark");
        lhm.put(null, "Hary");

        System.out.println("Linked Hash Map : ");
        lhm.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        
        System.out.println("\nAfter replacing Hary to Joker : ");
        lhm.replace(null, "Joker");
        lhm.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}

/* Output:
 * Linked Hash Map :
 * Key : 103, Value : John
 * Key : 105, Value : Allen
 * Key : 101, Value : Smith
 * Key : 104, Value : Mark
 * Key : null, Value : Hary
 * 
 * After replacing Hary to Joker :
 * Key : 103, Value : John
 * Key : 105, Value : Allen
 * Key : 101, Value : Smith
 * Key : 104, Value : Mark
 * Key : null, Value : Joker
*/