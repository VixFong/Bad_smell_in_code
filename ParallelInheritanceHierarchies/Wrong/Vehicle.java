package ParallelInheritanceHierarchies.Wrong;

public class Vehicle {
    void move() {
        System.out.println("Vehicle moving");
    }
}

// Child class for all cars
class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started");
    }
}

// Child class for all trucks
class Truck extends Vehicle {
    void loadCargo() {
        System.out.println("Truck loading cargo");
    }
}

/*  we have two parallel inheritance hierarchies: one for cars (Vehicle -> Car) and another for trucks (Vehicle -> Truck). 
Both of these hierarchies have the same prefix (Vehicle) in their class names, 
which is a sign of the Parallel Inheritance Hierarchies code smell. */
