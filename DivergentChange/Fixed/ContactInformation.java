package DivergentChange.Fixed;

public class ContactInformation {
    private String email;
    private String phoneNumber;
    
    public ContactInformation(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    // getters and setters for email and phoneNumber
    // ...
}

/* To avoid divergent change, 
we can create a separate class called ContactInformation that contains the contact information fields: */

