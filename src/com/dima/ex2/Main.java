package com.dima.ex2;

import com.dima.utils.Helpers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        double[] data = getData();
        int dayIndex = getDayUserInput(data.length);
        try {
            double price = data[dayIndex];
            System.out.printf("Price at that day: %.2f", price);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Day index bigger than generated array length");
        }
    }

//    IntStream generates a range from starting point up to end exclusively
//    Than map each element to a random double
//    Convert stream to array
//    return array of length random elements
//    returns empty array if length is negative

    private static double[] getData() {
        int length = getNumOfDays();
        return generateRandomValArr(length);
    }
    private static double[] generateRandomValArr(int length) {
        return IntStream.range(0, length).mapToDouble(el -> Helpers.getRandomNumber(12.0, 44.0)).toArray();

    }

    private static int getNumOfDays() {
        System.out.println("Enter num of days to generate report for: ");
        int num = 0;
        while (num <= 0) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                if (num <= 0) {
                    System.out.println("Number must be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entered value not a number");
            }
        }
        return num;
    }

    private static int getDayUserInput(int maxNum) {
        int dayIndex = -1;
        while (dayIndex < 0) {
            try {
                System.out.println("Enter day index: ");
                dayIndex = Integer.parseInt(scanner.nextLine());
                if (dayIndex < 0) {
                    System.out.println("Number must be greater than 0");
                } else if (dayIndex >= maxNum) {
                    System.out.println("Number must be less than number of days of generated report");
                    dayIndex = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entered value not a number");
            }
        }
        return dayIndex;
    }
}
