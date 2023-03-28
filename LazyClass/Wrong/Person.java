package LazyClass.Wrong;

public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters and setters omitted for brevity
}

/* Suppose you have a class called Person that contains only two fields: name and age. 
However, the age field is never used in the codebase, and it's not necessary for the functionality of the Person class. 
In this case, you could consider removing the age field from the Person class 
to simplify it and make it more focused on its primary responsibility, which is representing a person's name. */