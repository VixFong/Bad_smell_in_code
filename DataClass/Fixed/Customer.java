package DataClass.Fixed;

public class Customer {
    private String name;
    private String email;
    private Address address;

    public Customer(String name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void placeOrder(Order order) {
        // implementation details
    }
    
    // getters and setters
}

/* To fix this bad smell, we can add behavior to the ‘Customer’ class and use Encapsulation to restrict access to its fields. 
For example, we can add a ‘placeOrder()’ method to the ‘Customer’ class: */

