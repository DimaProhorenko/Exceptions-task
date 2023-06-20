package com.dima.utils;
import java.util.Random;
public class Helpers {
    private static final Random random = new Random();

    public static int getRandomNumber(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static double getRandomNumber(double min, double max) {
        return random.nextDouble(max - min) + min;
    }
}
