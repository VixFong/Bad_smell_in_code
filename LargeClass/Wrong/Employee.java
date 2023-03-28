package LargeClass.Wrong;
public class Employee {
  private String name;
  private String address;
  private String city;
  private String state;
  private String country;
  private String phone;
  private String email;
  private String department;
  private String position;
  private double salary;
  private int yearsOfExperience;
  // ... other variables and methods
}

/*This class has too many instance variables and is trying to do too much. 
We can apply the Extract Class refactoring to split the Employee class into smaller, more cohesive classes.
One way to do this is to group related instance variables into separate classes based on their common purpose. 
For example, we can extract a PersonalInfo class to encapsulate the name, address, city, state, country, phone, and email fields: */