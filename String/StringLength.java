// Program to find String Length without using length().

import java.util.*;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String input = sc.nextLine();

        int length = 0;
        
        for (char ch : input.toCharArray()) {
            length++;
        }

        int len = 0;
        try{
            while (true) {
                input.charAt(len);
                len++;
            }
        } catch (Exception e) {
            e.getMessage();
        }

        System.out.println("Input String : "+input);
        System.out.println("String Length is : "+length);
        System.out.println("String Length is : "+len);
    }   
}


/*
 * Enter a String :
 * Hello World
 * Input String : Hello World
 * String Length is : 11
 * String Length is : 11
*/