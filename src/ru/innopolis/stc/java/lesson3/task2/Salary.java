package ru.innopolis.stc.java.lesson3.task2;


import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double money; // зарплата
        System.out.println("Введите вашу зарплату:");
        Scanner in = new Scanner(System.in);
        money = in.nextDouble();

        double total = money - money * 0.13; // зарплата - 13%
        System.out.print(total);
    }
}


