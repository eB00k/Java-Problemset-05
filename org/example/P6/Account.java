package org.example.P6;

public class Account{
    private int accountNumber;
    private double balance = 0.0;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }
    public void debit(double amount) {
        if(amount > balance) {
            System.out.print("amount withdrawn exceeds the current balance!");
        } else {
            balance -= amount;
        }
    }
    public void print() {
        System.out.printf("A/C no: %d Balance=%.2f", accountNumber, balance);
    }
    public String toString() {
        return String.format("A/C no: %d Balance=%.2f", accountNumber, balance);
    }
}
