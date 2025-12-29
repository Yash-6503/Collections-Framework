// Program to Verify whether a number is even or not using Lambda Expressions

import java.util.*;

@FunctionalInterface
interface Verifier {
    boolean verifyEvenNum(int num);
}

public class EvenNumVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        Verifier verify = n -> {
            if (n <= 0) {
                System.out.println("Please provide +ve or non zero number");
                System.exit(0);
            }
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(verify.verifyEvenNum(num) ? num + " is Even Number" : num + " is not Even Number");
    }    
}


/* Output:
 * Enter number :
 * 10
 * 10 is Even Number
 * 
 * Enter number :
 * -10
 * Please provide +ve or non zero number
 * 
 * Enter number :
 * 0
 * Please provide +ve or non zero number
 * 
 * Enter number :
 * 3
 * 3 is not Even Number
 */