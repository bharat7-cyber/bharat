class Ride {
    String location;
    double distance;

    Ride(String location, double distance) {
        this.location = location;
        this.distance = distance;
    }

    void bookRide() {
        System.out.println("Ride booked to " + location + " for " + distance + " km. Fare: ₹" + (distance * 10));
    }
}

public class Uber {
    public static void main(String[] args) {
        Ride ride = new Ride("Airport", 12.5);
        ride.bookRide();
    }
}
