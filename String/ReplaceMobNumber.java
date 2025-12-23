// Program to replace mobile number by XXX

import java.util.Scanner;

public class ReplaceMobNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter Mobile Number : ");
        String mobNumber = sc.nextLine();

        if (mobNumber.length() != 10) {
            System.out.println("Moblie number should contain 10 Digits only...");
            return;
        }

        String masked = mobNumber.substring(0, 2) + "XXXXXX" + mobNumber.substring(8);
        System.out.println("Mask Mobile Number : "+masked);

    }
}

/* Output
 * Enter Mobile Number :
 * 99887766
 * Moblie number should contain 10 Digits only...
 * 
 * Enter Mobile Number :
 * 998877665544
 * Moblie number should contain 10 Digits only...
 * 
 * Enter Mobile Number :
 * 9988776655
 * Mask Mobile Number : 99XXXXXX55
 */