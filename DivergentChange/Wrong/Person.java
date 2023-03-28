public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    // getters and setters for name and address
    // ...
}

/*Let's say we have a class called Person that has a name and an address field. 
We want to add the ability to store contact information, which could be an email address or a phone number. 
However, we anticipate that the contact information might change frequently and independently from the name and address. */