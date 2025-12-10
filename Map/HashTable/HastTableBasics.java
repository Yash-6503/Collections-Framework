// Basics of HashTable
/*
 * HashTable is the Legacy[old] class available from JDK 1.v
 * Major Difference between HashMap and HashTable is Methods of HashMap are not synchronized
 * but HashTable methods are synchronized.
 * In HashMap one null key and multiple null values are allowed but 
 * In HashTable no null key or value is allowed if given then NullPointer Exception is raised.
*/

package Map.HashTable;

import java.util.Hashtable;

public class HastTableBasics {
    public static void main(String[] args) {

        try {
            Hashtable<Integer, String> ht = new Hashtable<>();
            ht.put(102, "Arjun");
            ht.put(104, "Salman");
            ht.put(101, "Vijay");
            ht.put(105, "Akshay");
            ht.put(103, "Yash");

            ht.putIfAbsent(106, "Rajesh");
            ht.putIfAbsent(101, "Ajay");

            System.out.println("Hash Table : ");
            ht.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        } catch (Exception e) {
            System.out.println("NullPointer Exception : null key or value is not allowed in HashTable");
        }
    }
}

/* Output:
 * Hash Table :
 * Key : 101, Value : Vijay
 * Key : 102, Value : Arjun
 * Key : 103, Value : Yash
 * Key : 104, Value : Salman
 * Key : 105, Value : Akshay
 * Key : 106, Value : Rajesh
*/
