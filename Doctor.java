class Doctor {
    String name;
    String specialization;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void appointment() {
        System.out.println("Appointment booked with Dr. " + name + " [" + specialization + "]");
    }
}

public class Hospital {
    public static void main(String[] args) {
        Doctor d = new Doctor("Aachal Lalwani", "Cancer Specialist");
        d.appointment();
    }
}
