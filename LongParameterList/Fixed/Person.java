package LongParameterList.Fixed;

public class Person {
    private String name;
    private int age;
    private String address;
    
    // constructor and getters/setters
    
    public void sendMessage(String message) {
        MailService mailService = new MailService();
        mailService.sendMail(this, message);
    }
}

/* In this updated code, we use the Person object itself as a parameter in the sendMail method, 
rather than passing in each individual field. This simplifies the parameter list and makes it easier 
to add or remove fields from the Person class without having to update the sendMessage method. */

