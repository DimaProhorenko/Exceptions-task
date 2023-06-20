package com.dima.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        while (true) {
            Integer value = getInput();
            if (value != null) {
                System.out.println("You entered " + value);
                break;
            }
        }
    }

    private static Integer getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entered value is not a number");
        }
        return null;
    }
}
