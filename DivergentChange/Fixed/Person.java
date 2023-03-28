package DivergentChange.Fixed;

public class Person {
    private String name;
    private String address;
    private ContactInformation contactInformation;
    
    public Person(String name, String address, ContactInformation contactInformation) {
        this.name = name;
        this.address = address;
        this.contactInformation = contactInformation;
    }
    
    // getters and setters for name, address, and contactInformation
    // ...
}

/* This way, if we need to change the contact information, 
we only need to modify the ContactInformation class and the code that uses it.
The Person class does not need to change, and we have avoided divergent change. */
