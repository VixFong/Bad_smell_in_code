package RefusedBequest.Fixed;

public class Bird implements IMovable {
    public void move() {
        System.out.println("The bird is flying.");
    }
}

/* Now, we can create a new subclass called Bird that implements IMovable directly, 
without inheriting the move() method from Animal: */

/* In this way, we've used Replace Inheritance with Delegation to solve the problem of a refused bequest. 
The Bird class doesn't want to inherit the move() method from Animal, but it still wants to reuse 
some behavior from the IMovable interface. */