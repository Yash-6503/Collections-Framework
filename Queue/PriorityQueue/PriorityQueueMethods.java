// Program on PriorityQueue Methods

import java.util.*;

public class PriorityQueueMethods {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //adding elements into priority queue
        pq.add(103);
        pq.add(104);
        pq.add(101);
        pq.add(105);
        pq.add(102);

        //displaying all elements
        System.out.println("Priority Queue Elements : " + pq);

        //displaying head element of priority queue
        // after displaying it will not delete the peek element
        System.out.println("Head Element : " + pq.peek());

        //removing element from priority queue
        pq.remove(104);
        System.out.println("After removing 104 element : " + pq);

        //adding new element through offer() method 
        pq.offer(106);
        System.out.println("After adding 106 element : " + pq);

        //displaying head element through poll() method.
        //after displaying it will delete the peek element
        System.out.println("Head Element : " + pq.poll());

        //displaying removed head/peek element by poll() method
        System.out.println("Poll() removes head element after displaying : " + pq);

    }
}

/* Output:
 * Priority Queue Elements : [101, 102, 103, 105, 104]
 * Head Element : 101
 * After removing 104 element : [101, 102, 103, 105]
 * After adding 106 element : [101, 102, 103, 105, 106]
 * Head Element : 101
 * Poll() removes head element after displaying : [102, 105, 103, 106]
*/
