class TrainTicket {
    String from, to;
    int passengers;

    TrainTicket(String from, String to, int passengers) {
        this.from = from;
        this.to = to;
        this.passengers = passengers;
    }

    void confirmBooking() {
        System.out.println("Train booked from " + from + " to " + to + " for " + passengers + " passenger(s).");
    }
}

public class Railway {
    public static void main(String[] args) {
        TrainTicket t = new TrainTicket("Delhi", "Mumbai", 3);
        t.confirmBooking();
    }
}
