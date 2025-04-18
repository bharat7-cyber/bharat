class Vehicle {
    void drive() {
        System.out.println("Driving vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
    }
}
