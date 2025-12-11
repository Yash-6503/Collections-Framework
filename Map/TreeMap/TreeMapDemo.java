// Program on TreeMap
/*
 * TreeMap inserts entries based on default natural sorting order.
 * Here, null as key is not allowed otherwise it will throw NullPointer Exception
 * It uses Red Black Tree Data structure.
*/
import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(104, "Hash");
        tmap.put(102, "Ajay");
        tmap.put(105, "Raj");
        tmap.put(101, "Yash");
        tmap.put(103, "Abhi");

        System.out.println("Tree Map : ");
        tmap.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        
    }
}

/* Output:
 * Tree Map :
 * Key : 101, Value : Yash
 * Key : 102, Value : Ajay
 * Key : 103, Value : Abhi
 * Key : 104, Value : Hash
 * Key : 105, Value : Raj
 */