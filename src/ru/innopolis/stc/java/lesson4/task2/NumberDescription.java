package ru.innopolis.stc.java.lesson4.task2;

import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {

        double number;

        System.out.println("Insert your number:");

        Scanner inputScanner = new Scanner(System.in);

        number = inputScanner.nextDouble();

        if (number > 0 && number % 2 == 0) {
            System.out.println("Your number is positive and even.");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("Your number is negative and even.");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("Your number is positive and odd.");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println("Your number is negative and odd.");
        } else if (number == 0) {
            System.out.println("Your number is zero");
        } else {
            System.out.println("Please insert the number.");
        }
    }
}
