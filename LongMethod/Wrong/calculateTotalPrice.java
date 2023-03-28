package LongMethod.Wrong;
    public double calculateTotalPrice(List<Item> cartItems, double discountPercent) {
        double total = 0.0;
        for (Item item : cartItems) {
            double itemPrice = item.getPrice();
            total += itemPrice;
        }
        double discountAmount = total * discountPercent / 100;
        return total - discountAmount;
    }

/* This is just an example for you to understand so it can't run
 * This method could be decomposed into smaller methods for better readability and maintainability.
 *  For instance, we could extract the code inside the loop into a new method that calculates the total price of a single item:
 */