// Testing Functional Interfaces using Anonymous Classes.

public class AnonymousClass {
    public static void main(String[] args) {
        
        Payment creditPayment = new Payment() {
            @Override
            public void makePayment() {
                System.out.println("Payment done by Credit Card");
            }
        };

        Payment debitPayment = new Payment() {
            @Override
            public void makePayment() {
                System.out.println("Payment done by Debit Card");
            }
        };
        Payment upiPayment = new Payment() {
            @Override
            public void makePayment() {
                System.out.println("Payment done by UPI");
            }
        };

        creditPayment.makePayment();
        debitPayment.makePayment();
        upiPayment.makePayment();
    }    
}

/* Output:
 * Payment done by Credit Card
 * Payment done by Debit Card
 * Payment done by UPI
*/