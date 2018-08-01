package com.nhe.bankapp.domain;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double withdrawAmount){
            balance -= withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }
}
