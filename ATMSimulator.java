class ATM {
    private double balance = 10000;

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void checkBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

public class ATMSimulator {
    public static void main(String[] args) {
        ATM userATM = new ATM();
        userATM.checkBalance();
        userATM.withdraw(1500);
        userATM.checkBalance();
    }
}
