// Program to count string's chars, spaces, numbers, sum of numbers and special-chars

import java.util.*;

public class CountStringOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String input = sc.nextLine().toLowerCase();

        if (input.isEmpty()) {
            System.err.println("String cannot be empty.");
            return;
        }

        System.out.println("\nInput String : " + input);
        System.out.println("Characters in String : " + countCharacters(input));
        System.out.println("Numbers in String : " + countNumbers(input));
        System.out.println("Spaces in String : " + countSpaces(input));
        System.out.println("Special Characters in String : " + countSpecialChars(input));
        System.out.println("Sum of Numbers in String : " + sumOfNumbers(input));
    }

    public static int sumOfNumbers(String input) {
        int sum = 0;
        if (input != null && !input.isEmpty()) {
            for (int i = 0; i <= input.length() - 1; i++) {
                if (Character.isDigit(input.charAt(i))) {
                    sum += Character.getNumericValue(input.charAt(i));
                }
            }
        }
        return sum;
    }

    public static int countSpecialChars(String input) {
        int count = 0;
        if (input != null && !input.isEmpty()) {
            for (int i = 0; i <= input.length() - 1; i++) {
                if (!(Character.isDigit(input.charAt(i))) && !(Character.isSpaceChar(input.charAt(i)))
                        && !(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')) {
                    count++;
                }
            }
        }
        return count;
    }

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
        return count - countSpecialChars(input);
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

/*
 * Output:
 * Enter a String :
 * 
 * String cannot be empty.
 * 
 * Enter a String :
 * #hello 55 world!! 10@=
 * 
 * Input String : #hello 55 world!! 10@=
 * Characters in String : 10
 * Numbers in String : 4
 * Spaces in String : 3
 * Special Characters in String : 5
 * Sum of Numbers in String : 11
 */