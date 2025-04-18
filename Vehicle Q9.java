class Vehicle {
    String make, model, fuelType;
    int year;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    double calculateFuelEfficiency() {
        return 0;
    }

    double calculateDistanceTraveled(double time, double speed) {
        return time * speed;
    }

    double getMaxSpeed() {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 15;
    }

    @Override
    double getMaxSpeed() {
        return 180;
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 8;
    }

    @Override
    double getMaxSpeed() {
        return 120;
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 35;
    }

    @Override
    double getMaxSpeed() {
        return 160;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Car car = new Car("Honda", "City", 2021, "Petrol");
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency());
        System.out.println("Car Max Speed: " + car.getMaxSpeed());

        Truck truck = new Truck("Tata", "LPT", 2020, "Diesel");
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency());
        System.out.println("Truck Max Speed: " + truck.getMaxSpeed());

        Motorcycle bike = new Motorcycle("Yamaha", "R15", 2022, "Petrol");
        System.out.println("Bike Fuel Efficiency: " + bike.calculateFuelEfficiency());
        System.out.println("Bike Max Speed: " + bike.getMaxSpeed());
    }
}
