class Bank {
    private long[] balance;

    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean withdraw(int account, long money) {
        if (!isValid(account)) return false;
        if (balance[account - 1] < money) return false;
        balance[account - 1] -= money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (!isValid(account)) return false;
        balance[account - 1] += money;
        return true;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (!isValid(account1) || !isValid(account2)) return false;
        if (balance[account1 - 1] < money) return false;
        
        balance[account1 - 1] -= money;
        balance[account2 - 1] += money;
        return true;
    }

    private boolean isValid(int account) {
        return account >= 1 && account <= balance.length;
    }
}

class Solution {
    public static void main(String[] args) {
        long[] initialBalances = {1000, 2000, 3000};
        Bank bank = new Bank(initialBalances);

        System.out.println(bank.transfer(1, 3, 500));
        System.out.println(bank.withdraw(3, 1000));
        System.out.println(bank.deposit(2, 500));
        System.out.println(bank.withdraw(1, 600));
        System.out.println(bank.transfer(4, 2, 100));
    }
}
