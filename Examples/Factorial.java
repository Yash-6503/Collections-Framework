// Program to Find factorial and its sum.

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int factorial = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
            System.out.println(i + " Factorial is : " + factorial);
        }

        System.out.println("\nAll "+n+" Factorial Sum is : "+sum);
    }
}

/* Output:
 * Enter number :
 * 5
 * 1 Factorial is : 1
 * 2 Factorial is : 2
 * 3 Factorial is : 6
 * 4 Factorial is : 24
 * 5 Factorial is : 120
 * 
 * All 5 Factorial Sum is : 153
*/