package ru.innopolis.stc.java.lesson8.task2;

import java.util.Scanner;

public class Calculator {

    protected static int subtractionInt(int a, int b) {
        return (a - b);
    }

    protected static int additionInt(int a, int b) {
        return (a + b);
    }

    protected static int multiplicationInt(int a, int b) {
        return (a * b);
    }

    protected static int divisionInt(int a, int b) {
        return (a / b);
    }

    protected static int percentInt(int a, int percent) { return (a / (100 * percent)); }

    protected static double subtractionDouble(double a, double b) {
        return (a - b);
    }

    protected static double additionDouble(double a, double b) {
        return (a + b);
    }

    protected static double multiplicationDouble(double a, double b) {
        return (a * b);
    }

    protected static double divisionDouble(double a, double b) {
        return (a / b);
    }

    protected static double percentDouble(double a, double percent) { return a / (100 * percent); }
}
