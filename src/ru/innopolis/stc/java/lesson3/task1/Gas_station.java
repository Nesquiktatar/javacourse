package ru.innopolis.stc.java.lesson3.task1;

import java.util.Scanner;

public class Gas_station {
    public static void main(String[] args) {
        double price;
        double volume;

        System.out.println("Введите стоимость 1 литра бензина:");

        Scanner in = new Scanner(System.in);
        price = in.nextDouble();

        System.out.println("Введите количество литров:");
        volume = in.nextDouble();

        double total = price*volume;

        System.out.println("Общий счет : " + total);

    }
}
