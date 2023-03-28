package RefusedBequest.Wrong;

public class Animal {
    public void move() {
        System.out.println("The animal is moving.");
    }
}

/* Now suppose we have a subclass called Bird that inherits from Animal. 
However, Bird doesn't want to use the move() method inherited from Animal, 
since birds move differently. We could override the move() method in Bird 
and provide a new implementation, but that would mean we'd still have the 
inherited method hanging around in the class. */

 
/* Instead, we could create a new interface called IMovable with a single method called move(), 
and have Animal implement this interface: */