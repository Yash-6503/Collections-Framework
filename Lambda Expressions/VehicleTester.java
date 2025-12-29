// Program to Test a Vehicle using Lambda Expression.

@FunctionalInterface
interface Vehicle {
    void run();
}

public class VehicleTester {
    public static void main(String[] args) {

        Vehicle bike = () -> System.out.println("Bike is Running...");
        bike.run();

        Vehicle car = () -> System.out.println("Car is Running...");
        car.run();

        Vehicle bus = () -> System.out.println("Bus is Running...");
        bus.run();
    
    }
}

/* Output:
 * Bike is Running...
 * Car is Running...
 * Bus is Running...
*/