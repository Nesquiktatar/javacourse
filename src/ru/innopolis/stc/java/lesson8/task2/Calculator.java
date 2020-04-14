package ru.innopolis.stc.java.lesson8.task2;

import java.util.Scanner;

public class Calculator {

    static Scanner inputScanner = new Scanner(System.in);


    static void subtractionInt(int a, int b) {
        System.out.println("Разность между первым и вторым числом = " + (a - b));
    }

    static void additionInt(int a, int b) {
        System.out.println("Сумма между первым и вторым числом = " + a + b);
    }

    static void multiplicationInt(int a, int b) {
        System.out.println("Произведение между первым и вторым числом = " + a * b);
    }

    static void divisionInt(int a, int b) {
        System.out.println("Соотношение между первым и вторым числом = " + a / b);
    }

    static void percentInt(int a, int b) {
        int userPercent = inputScanner.nextInt();
        System.out.println(userPercent + " процентов от числа " + a + " = " + b / (100 * userPercent));
    }

    static void subtractionDoule(double a, double b) {
        System.out.println("Разность между первым и вторым числом = " + (a - b));
    }

    static void additionDouble(double a, double b) {
        System.out.println("Сумма между первым и вторым числом = " + a + b);
    }

    static void multiplicationDouble(double a, double b) {
        System.out.println("Произведение между первым и вторым числом = " + a * b);
    }

    static void divisionDouble(double a, double b) {
        System.out.println("Соотношение между первым и вторым числом = " + a / b);
    }

    static void percentDouble(double a, double b) {

        int userPercent = inputScanner.nextInt();
        System.out.println(userPercent + " процентов от числа " + a + " = " + b / (100 * userPercent));
    }
}
