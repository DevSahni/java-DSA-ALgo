package ATM;

import javax.naming.InitialContext;

abstract class ATM {
    protected double balance;

    public ATM(double initialbalance) {
        this.balance = initialbalance;
    }

    abstract void checkBalance();

    abstract void deposit(double balance);

    abstract void withdraw(double amount);
}

class BankATM extends ATM {
    public BankATM(double initialbalance) {
        super(initialbalance);
    }

    @Override
    void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Updated Balance: " + balance);

        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankATM mybank = new BankATM(50000);
        mybank.checkBalance();
        mybank.deposit(10000);
        mybank.withdraw(5000);
        mybank.checkBalance();
    }
}
