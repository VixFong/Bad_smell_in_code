package PrimitiveObsession.Fixed;

public class Order {
    private String orderId;
    private int quantity;
    private Money price;

    public Order(String orderId, int quantity, Money price) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantity * price.getAmount();
    }
}

/* In this updated version, the Order class uses the Money class to represent the price field. 
This improves the design by encapsulating the price data into its own class,
making the code more modular and easier to maintain. */

