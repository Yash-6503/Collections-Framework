// Program on WeakHashMap
/*
 * WeakHashMap has weak reference type on its entries and Objects.
 * As compare to HashMap it has strong reference type on its entries and objects.
 * If the values of WeakHashMap are set to null then they are eligible for garbage collector to delete.
 * Here Garbage Collector dominates over WeakHashMap.
*/

package Map.WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Product p1 = new Product(101, "Laptop");

        WeakHashMap<Product, String> whm = new WeakHashMap<>();

        whm.put(p1, "Hyderabad");

        System.out.println("Weak Hash Map : ");
        whm.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

        p1 = null;

        System.gc();
        
        Thread.sleep(3000);

        System.out.println(whm);

    }
}

record Product(Integer id, String name) {
    
    @Override
    public void finalize() {
        System.out.println("Product Object is Eligible for Garbage Collector..");
    }
}

/* Output:
 * Weak Hash Map :
 * Key : Product[id=101, name=Laptop], Value : Hyderabad
 * Product Object is Eligible for Garbage Collector..
 * {}
*/