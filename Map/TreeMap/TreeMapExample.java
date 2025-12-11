// Program to Sort Product in both ways using id.

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Product, String> tm1 = new TreeMap<>((p1,p2)-> p1.pid().compareTo(p2.pid()));
        tm1.put(new Product(103, "Laptop"),"Hyderabad");
        tm1.put(new Product(101, "Mobile"),"Pune");
        tm1.put(new Product(102, "Headphone"), "Mumbai");
        
        System.out.println("Sorting based on Product Id in Ascending Order: ");
        tm1.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        
        
        TreeMap<Product, String> tm2 = new TreeMap<>((p1, p2) -> p2.pid().compareTo(p1.pid()));
        tm2.put(new Product(103, "Laptop"), "Hyderabad");
        tm2.put(new Product(101, "Mobile"), "Pune");
        tm2.put(new Product(102, "Headphone"), "Mumbai");

        System.out.println("\nSorting based on Product Id in Descending Order: ");
        tm2.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

        TreeMap<Product, String> tm3 = new TreeMap<>((p1, p2) -> p1.pname().compareTo(p2.pname()));
        tm3.put(new Product(103, "Laptop"), "Hyderabad");
        tm3.put(new Product(101, "Mobile"), "Pune");
        tm3.put(new Product(102, "Headphone"), "Mumbai");

        System.out.println("\nSorting based on Product Name in Ascending Order: ");
        tm3.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}

record Product(Integer pid, String pname){}

/*
 * Output:
 * Sorting based on Product Id in Ascending Order:
 * Key : Product[pid=101, pname=Mobile], Value : Pune
 * Key : Product[pid=102, pname=Headphone], Value : Mumbai
 * Key : Product[pid=103, pname=Laptop], Value : Hyderabad
 * 
 * Sorting based on Product Id in Descending Order:
 * Key : Product[pid=103, pname=Laptop], Value : Hyderabad
 * Key : Product[pid=102, pname=Headphone], Value : Mumbai
 * Key : Product[pid=101, pname=Mobile], Value : Pune
 * 
 * Sorting based on Product Name in Ascending Order:
 * Key : Product[pid=102, pname=Headphone], Value : Mumbai
 * Key : Product[pid=103, pname=Laptop], Value : Hyderabad
 * Key : Product[pid=101, pname=Mobile], Value : Pune
 */