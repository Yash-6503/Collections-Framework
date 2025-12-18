// Program to find prime numbers.

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find prime numbers upto it : ");
        int n = sc.nextInt();

        System.out.println("Prime numbers upto "+n+" are : ");
        int total = 0;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            
            if (count == 2) {
                total++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal prime numbers upto " + n + " are : "+total);
    }
}

/* Output:
 * Enter a number to find prime numbers upto it :
 * 100
 * Prime numbers upto 100 are :
 * 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 * Total prime numbers upto 100 are : 25
*/