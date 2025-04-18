class BankAccount {
    double balance = 200;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied! Balance would fall below 100.");
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(300);
        sa.withdraw(150);
        sa.withdraw(300);
    }
}
