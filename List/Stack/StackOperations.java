// Program to perform stack operations

package com.classes;

import java.util.*;

public class StackOperations{
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        try{
            //if we try to fetch stack objects before adding them then we will get EmptyStackException    
            //stack.pop();

            //inserting objects into stack using push()
            stack.push(100);
            stack.push(200);
            stack.push(300);
            stack.push(400);
            stack.push(500);

            System.out.println("After Inserting Stack : "+stack);

            //fetching topmost object from stack using peek()
            System.out.println("\nTopmost Object in Stack : "+stack.peek());

            //searching position of object from stack using search()
            System.out.println("\nPosition of 200 in Stack is : "+stack.search(200));

            //removing objects from stack using pop()
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            
            System.out.println("\nAfter Removing Objects from Stack : "+stack);

            //checking whether stack is empty or not using isEmpty()
            System.out.println("\nIs Stack is Empty : "+stack.isEmpty());

        }catch(EmptyStackException e){
            e.printStackTrace();
        }
    }
}

/* Output:
After Inserting Stack : [100, 200, 300, 400, 500]

Topmost Object in Stack : 500

Position of 200 in Stack is : 4

After Removing Objects from Stack : []

Is Stack is Empty : true
*/