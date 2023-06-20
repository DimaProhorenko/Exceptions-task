package com.dima.ex4;

public class SomeTech {
    public static final int MIN_TEMP = -10;
    public static final int MAX_TEMP = 35;

    public static class SomeTechWrongTemperatureException extends Exception {
        public SomeTechWrongTemperatureException(String message) {
            super(message);
        }
    }

    public static boolean isWorking(int temp) throws SomeTechWrongTemperatureException{
        if (temp < MIN_TEMP || temp > MAX_TEMP) {
            throw new SomeTechWrongTemperatureException("Some tech can't work at this temperature");
        }
        return true;
    }
}
