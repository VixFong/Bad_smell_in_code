package LongParameterList.Wrong;
public class Person {
    private String name;
    private int age;
    private String address;
    
    // constructor and getters/setters
    
    public void sendMessage(String message) {
        MailService mailService = new MailService();
        mailService.sendMail(this.name, this.address, message);
    }
}
