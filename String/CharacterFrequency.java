// Program to print frequency of character from given Sentence
import java.util.*;

public class CharacterFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence : ");
        String input = sc.nextLine().toLowerCase();

        if (input.isEmpty()) {
            System.out.println("Sentence cannot be empty...");
            return;
        }

        int freq[] = new int[26];
  
        for (int i = 0; i <= input.length() - 1; i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }

        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " : " + freq[i]);
                
            }
        }
    }
}

/*
 * Output:
 * Enter a Sentence :
 * Hello James How are you?
 * a : 2
 * e : 3
 * h : 2
 * j : 1
 * l : 2
 * m : 1
 * o : 3
 * r : 1
 * s : 1
 * u : 1
 * w : 1
 * y : 1
 * 
 * Enter a Sentence :
 * 
 * Sentence cannot be empty...
 */