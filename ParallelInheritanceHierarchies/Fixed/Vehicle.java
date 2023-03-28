package ParallelInheritanceHierarchies.Fixed;
// Common class for all vehicle types
class VehicleType {
    void move() {
        System.out.println("Vehicle moving");
    }
}

// Class for cars
class Car {
    VehicleType vehicleType;

    Car(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    void startEngine() {
        System.out.println("Car engine started");
    }

    void move() {
        vehicleType.move();
    }
}

// Class for trucks
class Truck {
    VehicleType vehicleType;

    Truck(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    void loadCargo() {
        System.out.println("Truck loading cargo");
    }

    void move() {
        vehicleType.move();
    }
}

/*   we have created a new class VehicleType that contains the common behavior of all types of vehicles. 
The Car and Truck classes now refer to an instance of VehicleType and inherit its behavior using the move() method. 
This eliminates the need for the parallel inheritance hierarchies and makes the code more maintainable.*/
