// Program on PriorityQueue
/*
 * PriorityQueue stores elements in FIFO order.
 * It inserts element from last it is called as REAR.
 * It removes element from starting it is called as FRONT.
 * Elements in it are ordered according to their natural order.
 * It does not permits/allows null elements.
 * Once one type element is inserted then another type elements are not allowed.
 * It stores the elements based on balanced binary heap tree.
 * Initial capacity of PriorityQueue is 11.
*/

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String... args) {
        PriorityQueue<Object> pq = new PriorityQueue<>();
        pq.add("Orange");
        pq.add("Grapes");
        pq.add("Apple");
        pq.add("Banana");
        // pq.add(12);         // Integer type cannot cast to String type
        // pq.add(null);      // null is not allowed

        System.out.println("Priority Queue Elements : " + pq);
        pq.forEach((p) -> System.out.println(p));
    }
}

/* Output:
 * Priority Queue Elements : [Apple, Banana, Grapes, Orange]
 * Apple
 * Banana
 * Grapes
 * Orange
 */