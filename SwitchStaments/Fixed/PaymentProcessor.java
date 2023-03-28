package SwitchStaments.Fixed;

public class PaymentProcessor {
    private PaymentMethodStrategy paymentMethodStrategy;
  
    public void setPaymentMethodStrategy(PaymentMethodStrategy paymentMethodStrategy) {
      this.paymentMethodStrategy = paymentMethodStrategy;
    }
  
    public void processPayment(Payment payment) {
      paymentMethodStrategy.processPayment(payment);
    }
  }

/* In the refactored code, the switch statement is replaced with polymorphism using the strategy pattern. 
The PaymentProcessor class now has a PaymentMethodStrategy object that is set using the setPaymentMethodStrategy method.
The processPayment method delegates to the processPayment method of the strategy object. 
The PaymentMethodStrategy interface defines the processPayment method that is 
implemented by three concrete classes: CreditCardPaymentStrategy, PaypalPaymentStrategy, and BitcoinPaymentStrategy. 
Each of these classes handles a specific payment method. This approach allows for adding new payment methods without 
changing the PaymentProcessor class. */
  
