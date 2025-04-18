class ElectricityBill {
    int units;

    ElectricityBill(int units) {
        this.units = units;
    }

    void calculateBill() {
        double bill = units * 6.5;
        System.out.println("Total Electricity Bill for " + units + " units: ₹" + bill);
    }
}

public class EBilling {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill(230);
        eb.calculateBill();
    }
}
