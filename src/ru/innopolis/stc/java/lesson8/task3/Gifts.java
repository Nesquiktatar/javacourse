package ru.innopolis.stc.java.lesson8.task3;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

import static ru.innopolis.stc.java.lesson8.task3.Box.*;

public class Gifts {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Сколько коробок вы хотите добавить?");
        int userNumber = inputScanner.nextInt();
        System.out.println("Выберите цвет:");
        String userColor = inputScanner.next();
        System.out.println(" Размер x стоит 100 рублей \t\n Размер s стоит 150 рублей \t\n Размер m стоит 200 рублей" +
                "\t\n Размер l стоит 400 рублей\t\n");

            System.out.println("Введите размер коробки:");
            String sizeString = inputScanner.next();

            char userSize = sizeString.charAt(sizeString.length() - 1);
            int cost = 0;
            switch (userSize) {

                case ('x'):
                    cost = 100;
                    break;
                case ('s'):
                    cost = 150;
                    break;
                case ('m'):
                    cost = 200;
                    break;
                case ('l'):
                    cost = 250;
                    break;
                default:
                    System.out.println("Выберите размер коробки из списка");
            }
            for (int i = 0; i < userNumber; i++) {
                Box newBox = new Box(userSize, userColor, cost);
            }

        System.out.printf("Cоздано %s коробок размера %s .\nУ всех коробок цвет %s .\nОбщая стоимость всех коробок = %s.",
                userNumber,sizeString, userColor, cost * userNumber);

            System.out.println("\nПоздравляю! Мы в сумме выпустили " + getBoxNumber() + " коробок.");

    }
}
