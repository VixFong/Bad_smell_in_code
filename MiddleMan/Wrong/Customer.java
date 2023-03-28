package MiddleMan.Wrong;

public class Customer {
    private Wallet wallet;
    
    public Customer() {
        this.wallet = new Wallet();
    }
    
    public double getBalance() {
        return wallet.getBalance();
    }
}

/*  the Wallet class is acting as a middle man. 
If you find that the Customer class is delegating too many methods to the Wallet class, 
you might consider using the Remove Middle Man technique.*/

/* you could modify the Customer class to directly access the necessary information from 
the Wallet class without going through the getBalance() method. For example:  */

/* This just an example for you to understand so it can't run */