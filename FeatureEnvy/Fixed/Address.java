package FeatureEnvy.Fixed;

public class Address {
    private String city;
    
    public String getCity() {
        return city;
    }
    
    public String getCustomerCity() {
        return getCity();
    }
}

/* Now the getCustomerCity method is where it belongs, in the Address class. This makes the code easier to read and maintain. */
