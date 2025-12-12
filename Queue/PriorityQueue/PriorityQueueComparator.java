// Program to order tasks using Comparator

import java.util.PriorityQueue;

public class PriorityQueueComparator {
    public static void main(String[] args) {
        PriorityQueue<TaskManager> taskQueue = new PriorityQueue<>((t1,t2)->t1.priority().compareTo(t2.priority()));
        taskQueue.add(new TaskManager("Write Programs", 2));
        taskQueue.add(new TaskManager("Submit Report", 3));
        taskQueue.add(new TaskManager("Find Bug", 1));

        System.out.println("Tasks in Queue : ");
        taskQueue.forEach((t) -> System.out.println(t));

        System.out.println("\nExecution Started...");
        while (!taskQueue.isEmpty()) {
            System.out.println("Executing : " + taskQueue.poll());
        }
        
        System.out.println(taskQueue.isEmpty() ? "Execution Finished..." : "Still Executing...");
    }   
}

record TaskManager(String name, Integer priority){}

/* Output:
 * Tasks in Queue :
 * TaskManager[name=Find Bug, priority=1]
 * TaskManager[name=Submit Report, priority=3]
 * TaskManager[name=Write Programs, priority=2]
 * 
 * Execution Started...
 * Executing : TaskManager[name=Find Bug, priority=1]
 * Executing : TaskManager[name=Write Programs, priority=2]
 * Executing : TaskManager[name=Submit Report, priority=3]
 * Execution Finished...
*/