package com.dima.ex3;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Account acc = new Account("Jack", 150.99);
        System.out.println(acc);
        try {
            double amount = getUserInput();
            if (acc.withdraw(amount)) {
                System.out.println("Operation successfull");
                System.out.println(acc);
            }
        } catch (Account.AccountBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double getUserInput() {
        double amount = -1;
        while (amount <= 0) {
            try {
                System.out.println("Enter amount to withdraw: ");
                amount = Double.parseDouble(scanner.nextLine());
                if (amount <= 0) {
                    System.out.println("Amount must be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entered value not a number");
            }
        }
        return amount;
    }
}
