// Program on NavigableMap Methods operations

package Map.NavigableMap;

import java.util.*;

public class NavigableMapMethods {
    public static void main(String[] args) {
        
        NavigableMap<Integer, String> nm = new TreeMap<>();
        nm.put(104, "Ajay");
        nm.put(102, "Harsh");
        nm.put(101, "Umesh");
        nm.put(105, "Suresh");
        nm.put(103, "Vijay");

        System.out.println("Map Elements : ");
        nm.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

        System.out.println("\nNavigable Map Methods Operations");
        System.out.println("Ceiling Entry : "+nm.ceilingEntry(103));
        System.out.println("Ceiling Key : "+nm.ceilingKey(104));
        System.out.println("Floor Entry : "+nm.floorEntry(104));
        System.out.println("Floor Key : "+nm.floorKey(104));
        System.out.println("Higher Entry : "+nm.higherEntry(102));
        System.out.println("Higher Key : "+nm.higherKey(102));
        System.out.println("Lower Entry : "+nm.lowerEntry(102));
        System.out.println("Lower Key : "+nm.lowerKey(102));
        System.out.println("First Entry : "+nm.firstEntry());
        System.out.println("Last Entry : "+nm.lastEntry());
        System.out.println("Poll First Entry : "+nm.pollFirstEntry());
        System.out.println("Poll Last Entry : "+nm.pollLastEntry());
    }
}

/* Output:
 * Map Elements :
 * Key : 101, Value : Umesh
 * Key : 102, Value : Harsh
 * Key : 103, Value : Vijay
 * Key : 104, Value : Ajay
 * Key : 105, Value : Suresh
 * 
 * Navigable Map Methods Operations
 * Ceiling Entry : 103=Vijay
 * Ceiling Key : 104
 * Floor Entry : 104=Ajay
 * Floor Key : 104
 * Higher Entry : 103=Vijay
 * Higher Key : 103
 * Lower Entry : 101=Umesh
 * Lower Key : 101
 * First Entry : 101=Umesh
 * Last Entry : 105=Suresh
 * Poll First Entry : 101=Umesh
 * Poll Last Entry : 105=Suresh
*/