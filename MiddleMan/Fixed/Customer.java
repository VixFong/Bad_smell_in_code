package MiddleMan.Fixed;

public class Customer {
    private Wallet wallet;
    
    public Customer() {
        this.wallet = new Wallet();
    }
    
    public double getBalance() {
        return wallet.getBalance();
    }
    
    public double getAvailableCredit() {
        return wallet.getCreditLimit() - wallet.getBalance();
    }
}

/*  the Customer class, the getAvailableCredit() method directly accesses the getCreditLimit() and getBalance() 
methods of the Wallet class, without going through the getBalance() method of the Customer class. 
This eliminates the need for the Wallet class to act as a middle man for these methods. */

/* This just an example for you to understand so it can't run */