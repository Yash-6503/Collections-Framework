// Program on IdentityHashMap
/*
 * IdentityHashMap uses '==' operator for comparing keys memory references and also uses 
 * System class's identityHashCode() method for generating hashcode to find bucket index location.
 * IdentityHashMap is faster than HashMap in case of key comparision.
 * It has default initial capicity of 32 and does not contains external load factor.
 * When it threshold limit exceeds then it increased by 2/3 of its default limit.
*/

package Map.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(103, "Akshay");
        hm.put(101, "Vijay");
        hm.put(102, "Arjun");
        hm.put(null, "Raj");
        System.out.println("Hash Map : ");
        hm.forEach((k,v) -> System.out.println("Key : "+k+", Value : "+v));
        
        IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
        ihm.put(102, "Smith");
        ihm.put(101, "John");
        ihm.put(103, "Allen");
        ihm.put(null, "Jack");
        System.out.println("\nIdentity Hash Map : ");
        ihm.forEach((k,v) -> System.out.println("Key : "+k+", Value : "+v));
    }
}

/* Output:
 * Hash Map :
 * Key : null, Value : Raj
 * Key : 101, Value : Vijay
 * Key : 102, Value : Arjun
 * Key : 103, Value : Akshay
 * 
 * Identity Hash Map :
 * Key : 102, Value : Smith
 * Key : 101, Value : John
 * Key : null, Value : Jack
 * Key : 103, Value : Allen
*/