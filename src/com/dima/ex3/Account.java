package com.dima.ex3;

public class Account {
    public static class AccountBalanceException extends Exception {
        public AccountBalanceException(String message) {
            super(message);
        }
    }
    private String name;
    private double balance;
    private int id;
    private static int _id = 0;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.id = _id++;
    }

    public boolean withdraw(double amount) throws AccountBalanceException {
        if (amount > balance) {
            throw new AccountBalanceException("Not enough money");
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account -> name: %s, balance: %.2f\n".formatted(name, balance);
    }
}
