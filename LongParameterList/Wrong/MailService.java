package LongParameterList.Wrong;

public class MailService {
    public void sendMail(String recipientName, String recipientAddress, String message) {
        // code to send mail
    }
}

/*In the Person class, when we want to send a message, we need to pass in the name and address fields as separate 
parameters to the sendMail method. This can be cumbersome if we have more fields to pass in. */