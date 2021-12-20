package com.dodemy;

// Write classes code here
class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
    }

    public void withdraw(double amount) {
    }

    public void printBalance() {
    }

}

class Savings extends Account {
    protected double interestRate = 0.8;

    public Savings(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
    }

    public void withdraw(double amount) {
        balance -= amount + (amount * interestRate);
    }

    public void printBalance() {
        System.out.println("Your balance in your Savings: " + balance);
    }

}

class Current extends Account {
    public Current(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void printBalance() {
        System.out.println("Your balance in your Current account: " + balance);
    }
}


class Main {

    public static void main(String[] args) {
        // make instances of classes here
        Account SAccount = new Savings(50_000);
        // call their traits functions here
        SAccount.deposit(1000);
        SAccount.printBalance();

        SAccount.withdraw(3000);
        SAccount.printBalance();

        System.out.println();

        // make instances of classes here
        Account CAccount = new Current(50_000);
        // call their traits functions here
        CAccount.deposit(1000);
        CAccount.printBalance();

        CAccount.withdraw(3000);
        CAccount.printBalance();
    }

}