package LongMethod.Fixed;

private double calculateItemPrice(Item item) {
    return item.getPrice();
}

public double calculateTotalPrice(List<Item> cartItems, double discountPercent) {
    double total = 0.0;
    for (Item item : cartItems) {
        total += calculateItemPrice(item);
    }
    double discountAmount = total * discountPercent / 100;
    return total - discountAmount;
}

/* This is just an example for you to understand so it can't run
 * This makes the code easier to read and understand, especially if the logic for calculating the item price becomes more complex. 
 * The 'calculateItemPrice()' method can now be reused elsewhere in the code as well.
 */