// Operations on TreeMap

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        TreeMap<String, String> tmap = new TreeMap<>();

        tmap.put("key2", "value2");
        tmap.put("key3", "value3");
        tmap.put("key1", "value1");

        System.out.println("Tree Map Elements : ");
        tmap.forEach((k, v) -> System.out.println("{ Key : " + k + ", Value : " + v + " }"));

        SortedMap sm = (SortedMap) tmap;
        System.out.println("\nOperations :");
        System.out.println("First Key : "+sm.firstKey());
        System.out.println("Last Key : "+sm.lastKey());
    }    
}

/* Output:
 * Tree Map Elements :
 * { Key : key1, Value : value1 }
 * { Key : key2, Value : value2 }
 * { Key : key3, Value : value3 }
 * 
 * Operations :
 * First Key : key1
 * Last Key : key3
 * PS D:\Collectio
 */