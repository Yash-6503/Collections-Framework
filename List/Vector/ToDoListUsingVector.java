// Program to create To-Do List using Vector.

package com.classes;

import java.util.*;

public class ToDoListUsingVector{
    public static void main(String args[]){
        Vector<String> toDoList = new Vector<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n-----------To-Do List------------");
            System.out.println("1. Add Task to To-Do List");
            System.out.println("2. Show Tasks");
            System.out.println("3. Mark Task as completed");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("\nEnter Task : ");
                    sc.nextLine();
                    String task = sc.nextLine();
                    toDoList.add(task);
                    break;

                case 2:
                    if(toDoList.isEmpty()){
                        System.out.println("Your To-Do List is Empty..");
                    }else{
                        System.out.println("\nYour Tasks are:");
                        for(int i=0; i<toDoList.size(); i++){
                            System.out.println((i + 1)+". "+toDoList.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nEnter Task number : ");
                    int taskNumber = sc.nextInt();
                    if(taskNumber >= 1 && taskNumber <= toDoList.size()){
                        String taskCompleted = toDoList.remove(taskNumber - 1);
                        System.out.println("Task Marked as Completed : "+taskCompleted);
                    }else{
                        System.out.println("Invalid Task Number");
                    }
                    break;

                case 4:
                    System.out.println("Exiting.....");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice....");
            }
        }while(choice != 4);
    }
}

/*
-----------To-Do List------------
1. Add Task to To-Do List
2. Show Tasks
3. Mark Task as completed
4. Exit
Enter your Choice:
2
Your To-Do List is Empty..

-----------To-Do List------------
1. Add Task to To-Do List
2. Show Tasks
3. Mark Task as completed
4. Exit
Enter your Choice:
1

Enter Task :
Advance-Java Revision

-----------To-Do List------------
1. Add Task to To-Do List
2. Show Tasks
3. Mark Task as completed
4. Exit
Enter your Choice:
2

Your Tasks are:
1. Advance-Java Revision

-----------To-Do List------------
1. Add Task to To-Do List
2. Show Tasks
3. Mark Task as completed
4. Exit
Enter your Choice:
1

Enter Task :
SpringBoot Recap

-----------To-Do List------------
1. Add Task to To-Do List
2. Show Tasks
3. Mark Task as completed
4. Exit
Enter your Choice:
2

Your Tasks are:
1. Advance-Java Revision
2. SpringBoot Recap

-----------To-Do List------------
1. Add Task to To-Do List
2. Show Tasks
3. Mark Task as completed
4. Exit
Enter your Choice:
3

Enter Task number :
2
Task Marked as Completed : SpringBoot Recap

-----------To-Do List------------
1. Add Task to To-Do List
2. Show Tasks
3. Mark Task as completed
4. Exit
Enter your Choice:
2

Your Tasks are:
1. Advance-Java Revision

-----------To-Do List------------
1. Add Task to To-Do List
2. Show Tasks
3. Mark Task as completed
4. Exit
Enter your Choice:
4

Exiting....
*/