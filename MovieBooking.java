class Ticket {
    String movieName;
    int seats;

    Ticket(String movieName, int seats) {
        this.movieName = movieName;
        this.seats = seats;
    }

    void book() {
        System.out.println("Booked " + seats + " seats for " + movieName);
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        Ticket t = new Ticket("Avengers", 2);
        t.book();
    }
}
