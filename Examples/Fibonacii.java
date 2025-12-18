// Program to find Fibonacii Series.

import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to find fibonacii : ");
        int n = sc.nextInt();

        int prev = 0, next = 1, result = 0;

        System.out.println("Fibonacii Series upto "+n+" : ");
        for (int i = 0; i <= n; i++) {
            System.out.print(prev+" ");
            result = prev + next;
            prev = next;
            next = result;
        }
    }    
}

/* Output:
 * Enter number to find fibonacii :
 * 5
 * Fibonacii Series upto 5 :
 * 0 1 1 2 3 5
*/