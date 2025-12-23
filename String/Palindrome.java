// Program to check whether a string is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string : ");
        String input = sc.nextLine().toLowerCase();

        String rev = new String();
        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);
        }

        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


        // if (input.toLowerCase().hashCode() == rev.toLowerCase().hashCode()) {
        //     System.out.println(input+" is Palindrome String");
        // } else {
        //     System.out.println(input+" is Not Palindrome String");
        // }
    }    
}

/* Output
 * Enter input String :
 * Hello World!!!
 * Input String is : Hello World!!!
 * Reverse String is : !!!dlroW olleH
*/