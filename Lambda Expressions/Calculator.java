// Program to Calculate sum of numbers using Lambda Expressions.

import java.util.Scanner;

@FunctionalInterface
interface Calculate {
    Double doSum(double a, double b);
    
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter 2nd number : ");
        double num2 = sc.nextDouble();

        Calculate calc = (a, b) -> {
            if (a < 0 || b < 0) {
                return -1D;
            } else {
                return Double.valueOf(num1 + num2);
            }
        };

        Double res = calc.doSum(num1, num2);
        System.out.println(
                res > 0 ? "Sum of " + num1 + " + " + num2 + " = " + res : "Please provide +ve numbers to calculate");

        sc.close();
    }
}

/*
 * Enter 1st number :
 * 10
 * Enter 2nd number :
 * 20
 * Sum of 10.0 + 20.0 = 30.0
 * 
 * Enter 1st number :
 * -10
 * Enter 2nd number :
 * 20
 * Please provide +ve numbers to calculate
 */