class Vehicle {
    int speed = 60;
    void maxSpeed() {
        System.out.println("Vehicle speed: " + speed);
    }
}

class Car extends Vehicle {
    int speed = 120;
    void maxSpeed() {
        System.out.println("Car speed: " + speed);
    }
}

class Bike extends Vehicle {
    int speed = 180;
    void maxSpeed() {
        System.out.println("Bike speed: " + speed);
    }
}

public class method_overload {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle c = new Car();
        Vehicle b = new Bike();
        v.maxSpeed();
        c.maxSpeed();
        b.maxSpeed();
    }
}
