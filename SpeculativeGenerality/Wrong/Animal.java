package SpeculativeGenerality.Wrong;

public abstract class Animal {
    // fields and methods common to all animals
    public abstract void move();
    public abstract void eat();
    public abstract void sleep();
    // ... many other abstract methods
}

/* the Animal class defines a set of abstract methods that all animal subclasses should implement. 
However, if we only have a small number of animal subclasses, having an abstract Animal class may be an unnecessary abstraction. 
It adds complexity to the code and may make it harder to understand and maintain. */

    
