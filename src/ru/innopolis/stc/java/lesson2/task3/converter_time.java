package ru.innopolis.stc.java.lesson2.task3;

public class converter_time {
    public static void main(String[] args) {
        int seconds = 5400; // секунд
        double minutes = seconds / 60.0; // минут
        double hours = minutes / 60.0; // часов

        System.out.print(hours);
    }
}