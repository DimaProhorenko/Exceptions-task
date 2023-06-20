package com.dima.ex4;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        while (true) {
            try {
                int temp = getTemperatureFromUser();
                SomeTech.isWorking(temp);
                System.out.println("Working fine");
                break;
            } catch (SomeTech.SomeTechWrongTemperatureException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int getTemperatureFromUser() {
        System.out.println("Enter current temperature: ");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entered value not a number");
            }
        }
    }
}
