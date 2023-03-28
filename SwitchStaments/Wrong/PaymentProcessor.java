package SwitchStaments.Wrong;
public class PaymentProcessor {
    public void processPayment(Payment payment) {
      switch (payment.getMethod()) {
        case "credit_card":
          processCreditCard(payment);
          break;
        case "paypal":
          processPaypal(payment);
          break;
        case "bitcoin":
          processBitcoin(payment);
          break;
        default:
          throw new IllegalArgumentException("Invalid payment method: " + payment.getMethod());
      }
    }
  
    private void processCreditCard(Payment payment) {
      // Process credit card payment
    }
  
    private void processPaypal(Payment payment) {
      // Process PayPal payment
    }

    private void processBitcoin(Payment payment) {
      // Process Bitcoin payment
    }
  }

