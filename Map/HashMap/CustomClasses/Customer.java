// Customer class

import java.util.Objects;

public class Customer {
    
    private Integer id;
    private String name;

    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer Id : "+id+", Customer Name : "+name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return false;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Customer cust = (Customer) obj;
        return Objects.equals(id, cust.id) && Objects.equals(name, cust.name);
    }
}
