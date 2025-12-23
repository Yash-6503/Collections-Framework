// Program to convert Strings to upper and lower case
import java.util.Scanner;

public class LowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to convert into Lower-Case : ");
        String input1 = sc.nextLine();

        System.out.println("Enter String to covert into Upper-Case : ");
        String input2 = sc.nextLine();

        String lowerCase = new String();
        String upperCase = new String();

        //lower
        for (int i = 0; i <= input1.length() - 1; i++) {
            if (input1.charAt(i) >= 'A' && input1.charAt(i) <= 'Z') {
                lowerCase += (char) (input1.charAt(i) + 32);
            } else {
                lowerCase += input1.charAt(i);
            }
        }

        //upper
        for (int i = 0; i <= input2.length() - 1; i++) {
            if (input2.charAt(i) >= 'a' && input2.charAt(i) <= 'z') {
                upperCase += (char) (input2.charAt(i) - 32);
            } else {
                upperCase += input2.charAt(i);
            }
        }

        System.out.println(input1 + " to LowerCase : " + lowerCase);
        System.out.println(input2 + " to UpperCase : " + upperCase);

    }
}

/*
 * Enter String to convert into Lower-Case :
 * HELLo woRLD!!
 * 
 * Enter String to covert into Upper-Case :
 * helLo World!!
 * 
 * HELLo woRLD!! to LowerCase : hello world!!
 * helLo World!! to UpperCase : HELLO WORLD!!
*/
