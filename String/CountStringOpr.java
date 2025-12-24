// Program to count string's chars, spaces, numbers and special-chars

import java.util.*;

public class CountStringOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String input = sc.nextLine().toLowerCase();

        System.out.println("Input String : " + input);
        System.out.println("Numbers in String : " + countNumbers(input));
        System.out.println("Spaces in String : " + countSpaces(input));
        System.out.println("Characters in String : " + countCharacters(input));
    }

    // public static int countSpecialChars(String input) {
    //     int count = 0;
    //     if (input != null && !input.isEmpty()) {
    //         for (int i = 0; i <= input.length() - 1; i++) {
    //             if ((input.charAt(i) >= '0' && input.charAt(i) <= '9') || ) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public static int countCharacters(String input){
        int count = 0;
        if (input != null && !input.isEmpty()) {
            for (int i = 0; i <= input.length() - 1; i++) {
                if (Character.isSpaceChar(input.charAt(i)) || Character.isDigit(input.charAt(i))) {
                    continue;
                } else {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static int countSpaces(String input) {
        int count = 0;
        if (input != null && !input.isEmpty()) {
            for (int i = 0; i <= input.length() - 1; i++) {
                if (Character.isSpaceChar(input.charAt(i))) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static int countNumbers(String input){
        int count = 0;
        if (input != null && !input.isEmpty()) {
            for (int i = 0; i <= input.length() - 1; i++) {
                if (Character.isDigit(input.charAt(i))) {
                    count++;
                }
            }
        }
        
        return count;
    }
}