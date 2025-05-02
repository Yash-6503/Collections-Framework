// Program to Print Record details using Vector.

package com.classes;

import java.util.*;

public class RecordWithVector{
    public static void main(String args[]){
        Vector<Product> products = new Vector<>();
        products.add(new Product(222,"Laptop",50000.24));
        products.add(new Product(333,"Mobile",20000.45));
        products.add(new Product(111,"Watch",5000.84));

        System.out.println("All Products Details:");
        products.forEach(System.out::println);
    }
}

record Product(Integer id, String name, Double price){

}

/* Output:
All Products Details:
Product[id=222, name=Laptop, price=50000.24]
Product[id=333, name=Mobile, price=20000.45]
Product[id=111, name=Watch, price=5000.84]
*/