// Program to Find Sum of Digits in a number
import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a Number : ");
            long temp = sc.nextLong();

            int num = (int) temp;
            int sum = 0;
            while (temp != 0) {
                sum += (temp % 10);
                temp /= 10;
            }
            System.out.println("Digit Sum of "+num+" is : "+sum);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * Enter a Number :
 * 123
 * Digit Sum of 123 is : 6
 * 
 * Enter a Number :
 * 5555
 * Digit Sum of 5555 is : 20
 * 
 * Enter a Number :
 * 9922883377
 * Digit Sum of 1332948785 is : 58
 */