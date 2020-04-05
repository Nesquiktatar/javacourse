package ru.innopolis.stc.java.lesson3.task3;

import java.util.Scanner;

public class converter_time {
    public static void main(String[] args) {
        double seconds; // секунд

        System.out.println("Введите количество секунд:");

        Scanner in = new Scanner(System.in);
        seconds = in.nextDouble();

        double minutes = seconds / 60.0; // минут
        double hours = minutes / 60.0; // часов

        System.out.println("В часах это будет: " + hours);
    }
}
