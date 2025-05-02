// Program to Convert Array to Vector and Vector to Array

package com.classes;

import java.util.*;

public class ArrayToVector{
    public static void main(String args[]){
        Vector<Integer> vector = new Vector<>();

        int[] arr = {89,55,76,96,49,60};

        System.out.println("Array elements: "+Arrays.toString(arr));

        //converting array to vector
        for(int i=0; i<arr.length; i++){
            vector.add(arr[i]);
        }

        System.out.println("\nAfter converting Array to Vector: "+vector);

        //sorting vector elements
        Collections.sort(vector);
        System.out.println("\nAfter sorting Vector elements: "+vector);

        //finding max and min
        System.out.println("\nMaximum element in Vector: "+Collections.max(vector));
        System.out.println("\nMinimum element in Vector: "+Collections.min(vector));

        //reversing vector elements
        Collections.reverse(vector);
        System.out.println("\nAfter Reversing Vector elements: "+vector);

        //Converting Vector into array
        Object[] array = vector.toArray();
        System.out.println("\nAfter Converting Vector to Array: "+Arrays.toString(array));
    }
}

/* Output:
Array elements: [89, 55, 76, 96, 49, 60]

After converting Array to Vector: [89, 55, 76, 96, 49, 60]

After sorting Vector elements: [49, 55, 60, 76, 89, 96]

Maximum element in Vector: 96

Minimum element in Vector: 49

After Reversing Vector elements: [96, 89, 76, 60, 55, 49]

After Converting Vector to Array: [96, 89, 76, 60, 55, 49]
*/