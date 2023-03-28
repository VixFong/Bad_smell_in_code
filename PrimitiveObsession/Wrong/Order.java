package PrimitiveObsession.Wrong;

public class Order {
    private String orderId;
    private int quantity;
    private double price;

    public Order(String orderId, int quantity, double price) {
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

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}

/* the Order class has three primitive data types - String for orderId, int for quantity, and double for price. 
These data types are used to represent an order in a simple e-commerce system. 
However, this class suffers from Primitive Obsession because the data types are not encapsulated in a separate class. */

/* To address this issue, we can create a Money class that encapsulates the price and currency fields. 
Here's an updated version of the Order class: */