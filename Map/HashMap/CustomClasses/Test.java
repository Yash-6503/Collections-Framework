// Program to Test Custom class working in HashMap.
/*
 * While working with any custom class we need to compulsory Override the hashcode()
 * and equals() methods so we can avoid duplicate entries in Map.
 * If in case we don't Override this both methods then Duplicate entries will be inserted to Map.
 * As per our requirements we can modify these method logics to set some restrictions.
*/


import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
     
        Customer cust1 = new Customer(101, "Scott");
        Customer cust2 = new Customer(101, "Scott");

        System.out.println("Customer 1 hashcode : "+cust1.hashCode() + "\nCustomer 2 hashcode : " + cust2.hashCode());
        System.out.println("Is Both Customers are Equal? : "+cust1.equals(cust2));

        HashMap<Customer, String> map = new HashMap<>();
        map.put(cust1, "A");
        map.put(cust2, "B");


        System.out.println("Size of Map : " + map.size());
        System.out.println(map);

    }
}


/* Output:
 * Customer 1 hashcode : 79716027
 * Customer 2 hashcode : 79716027
 * Is Both Customers are Equal? : true
 * Size of Map : 1
 * {Customer Id : 101, Customer Name : Scott=B}
*/