// Program to find Factorial of array elements
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many elements in array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        System.out.println("Enter " + n + " elements in array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray Elements are : " + Arrays.toString(arr));
        
        //find factorial of each array element
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int fact = 1;
            for (int j = 1; j <= arr[i]; j++) {
                fact *= j;
            }
            System.out.println("Factorial of " + arr[i] + " is : " + fact);
            arr[i] = fact;
        }

        // after replacing all array by its factorial
        System.out.println("\nArray after replacing by its factorials : "+Arrays.toString(arr));
    }
}

/*
 * Enter how many elements in array :
 * 5
 * Enter 5 elements in array :
 * 1
 * 2
 * 3
 * 4
 * 5
 * 
 * Array Elements are : [1, 2, 3, 4, 5]
 * 
 * Factorial of 1 is : 1
 * Factorial of 2 is : 2
 * Factorial of 3 is : 6
 * Factorial of 4 is : 24
 * Factorial of 5 is : 120
 * 
 * Array after replacing by its factorials : [1, 2, 6, 24, 120]
*/