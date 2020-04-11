package ru.innopolis.stc.java.test;

import java.util.Random;
import java.util.Scanner;


public class Game {
    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введи имя пользователя: ");
        String userName = inputScanner.next();
        System.out.println("Введи возраст пользователя: ");
        int userAge = inputScanner.nextInt();

        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = a * b;

        System.out.println("Добро пажловать " + userName + " в игру.");
        System.out.println("Произведение двух чисел =" + c + "\nУгадай два множителя.");
        do {
            System.out.println("Введите первое число:");
            int usera = inputScanner.nextInt();
            System.out.println("Введите второе число:");
            int userb = inputScanner.nextInt();

            if (usera == a && userb == b) {
                System.out.println("Поздравляю, ты угадал числа!");
                break;
            } else {
                System.out.println("Неверно. Попробуй еще раз.");
            }
        } while (true);

    }
}
