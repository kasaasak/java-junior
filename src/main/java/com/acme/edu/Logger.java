package com.acme.edu;

public class Logger {
    private static String lastOutputString = "empty";
    private static Integer repeatCount = 1;
    private static void clearLastStringCounter() {
        repeatCount = 1;
        lastOutputString = "empty";

    }
    public static void log(int message) {
        System.out.print("primitive: " + message);
        System.out.print("\n");
        clearLastStringCounter();
    }

    public static void log(char message) {
        System.out.println("char: " + message);
    }

    public static void log(Object message) {
        System.out.println("reference: " + message);
    }

    public static void log(boolean message) {
        System.out.println("primitive: " + message);
    }

    public static void log(byte message) {
        System.out.println("primitive: " + message);
    }

    public static void log(String strMessage) {
/*
        if (lastOutputString != strMessage) {
            lastOutputString = strMessage;
            System.out.println((repeatCount > 1) ? lastOutputString + "x" + repeatCount.toString(): strMessage);
            clearLastStringCounter();
        } else {
            repeatCount++;
        }
*/
        System.out.println("string: " + strMessage);
    }
}
