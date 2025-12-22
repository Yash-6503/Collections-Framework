// Program to calculate the numbers sum from a input string

public class StringNumSum {
    public static void main(String[] args) {
        String input = "abc123pqr987d";
        int sum = 0;
        for (int i = 0; i <= input.length() - 1; i++) {
            if (Character.isDigit(input.charAt(i))) {
                sum += Character.getNumericValue(input.charAt(i));
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Sum : " + sum);
        
    }
}

/* Output
 * Input : abc123pqr987d
 * Sum : 30
*/