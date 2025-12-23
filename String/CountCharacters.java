// Program to count characters from string.

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String input = sc.nextLine().toLowerCase();

        int chars = 0;
        for (int i = 0; i <= input.length() - 1; i++) {
            // if (!Character.isDigit(input.charAt(i)) && !Character.isSpaceChar(input.charAt(i))) {
            //     chars++;
            // }

            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                chars++;
            }

            // if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
            //     chars++;
            // }
        }

        System.out.println("Input String : " + input);
        System.out.println("Characters in String : " + chars);
        
    }
}

/* Output
 * Enter a String :
 * hello22@1
 * Input String : hello22@1
 * Characters in String : 5
*/