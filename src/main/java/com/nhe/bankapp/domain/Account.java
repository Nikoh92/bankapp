package com.nhe.bankapp.domain;

public class Account {

    private final String id;
    private double balance;
    private final Client client;

    public Account(String id,double balance, Client client) {
        this.id = id;
        this.balance = balance;
        this.client = client;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double withdrawAmount){
            balance -= withdrawAmount;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return id != null ? id.equals(account.id) : account.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
