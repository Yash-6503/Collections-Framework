// Program to make a given string reverse.

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input String : ");
        String input = sc.nextLine();
        String rev = new String();
        System.out.println("Input String is : " + input);
        for (int i = input.length() - 1; i >= 0; i--) {
            // System.out.print(input.charAt(i));
            rev += input.charAt(i);
        }
        System.out.print("Reverse String is : "+rev);
    }
}

/* Output
 * Enter input String :
 * Hello World!!!
 * Input String is : Hello World!!!
 * Reverse String is : !!!dlroW olleH
*/