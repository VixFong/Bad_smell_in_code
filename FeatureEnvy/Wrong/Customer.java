package FeatureEnvy.Wrong;

public class Customer {
    private String name;
    private Address address;
    
    public String getCustomerCity() {
        return address.getCity();
    }
}

/* In this code, the getCustomerCity method seems to be more interested in the Address class than the Customer class. 
It invokes the getCity method on the address object to calculate the value it returns. 
To fix this, we can move the getCustomerCity method to the Address class: */