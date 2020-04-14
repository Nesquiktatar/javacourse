package ru.innopolis.stc.java.lesson8.task1;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        System.out.println("Рассчитаем силу тяжести.\nВведите массу тела в килограммах, которое притягивает планет:");

        Scanner inputScanner = new Scanner(System.in);
        double weight = inputScanner.nextDouble();

        double F = weight * MyFinal.g;
        System.out.println("Сила тяжести = " + F + " Н");

    }
}
