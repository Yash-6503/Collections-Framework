// Program to count words from a Sentence

import java.util.*;
import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence : ");
        String input = sc.nextLine().toLowerCase();

        if (input.isEmpty()) {
            System.err.println("Sentence cannot be empty.");
            return;
        }

        String words[] = input.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("\nSentence : " + input);
        System.out.println("Words and their count : \n" + wordCount);

    }
}

/* Output
 * Enter a Sentence :
 * Hello Who are you? Hello I am Jacks!!
 * 
 * Sentence : hello who are you? hello i am jacks!!
 * Words and their count :
 * {jacks!!=1, are=1, you?=1, i=1, hello=2, am=1, who=1}
 * 
 * Enter a Sentence :
 * 
 * Sentence cannot be empty.
 */