// Program to count Vowels and Consonants in String.

import java.util.*;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i <= input.length() - 1; i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Input String : " + input);
        System.out.println("Vowels in String : " + vowels);
        System.out.println("Consonants in String : " + consonants);
        
    }
}

/*
 * Hello India
 * Input String : hello india
 * Vowels in String : 5
 * Consonants in String : 6
*/