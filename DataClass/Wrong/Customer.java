package DataClass.Wrong;

public class Customer {
    public String name;
    public String email;
    public String address;
    public String city;
    public String state;
    public String zipCode;
}

/* In this example, the ‘Customer’ class contains fields for the customer's name, email, address, city, state, and zip code.
 However, there are no methods or behavior associated with the class, making it a pure Data Class.
This can lead to the following bad smells: Feature Envy, Duplication, High Coupling */
