package ru.innopolis.stc.java.lesson8.task3;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

import static ru.innopolis.stc.java.lesson8.task3.Box.boxNumber;
import static ru.innopolis.stc.java.lesson8.task3.Box.printOutCount;

public class Gifts {
    public static void main(String[] args) {

        System.out.println("Сколько коробок вы хотите добавить?");
        Scanner inputScanner = new Scanner(System.in);
        int userNumber = inputScanner.nextInt();

        System.out.println("Выберите цвет:");
        String userColor = inputScanner.next();

        System.out.println(" Размер x стоит 100 рублей \t\n Размер s стоит 150 рублей \t\n Размер m стоит 200 рублей" +
                "\t\n Размер l стоит 400 рублей\t\n");
        System.out.println("Введите размер коробки:");
        String sizeString = inputScanner.next();
        char userSize = sizeString.charAt(sizeString.length() - 1);

        switch (userSize) {
            case ('x'):
                for (int i = 0; i < userNumber; i++) {
                    Box newboxx = new Box('x', userColor, 100);
                }
                System.out.println("Создано " + userNumber + (" коробок размера " + sizeString + ".\n У всех коробок цвет : " + userColor));

                break;
            case ('s'):
                for (int i = 0; i < userNumber; i++) {
                    Box newboxx = new Box('s', userColor, 150);
                }
                System.out.println("Создано " + userNumber + (" коробок размера " + sizeString + ".\n У всех коробок цвет : " + userColor));

                break;
            case ('m'):
                for (int i = 0; i < userNumber; i++) {
                    Box newboxx = new Box('m', userColor, 200);
                }
                System.out.println("Создано " + userNumber + (" коробок размера " + sizeString + ".\n У всех коробок цвет : " + userColor));

                break;
            case ('l'):
                for (int i = 0; i < userNumber; i++) {
                    Box newboxx = new Box('l', userColor, 250);
                }
                System.out.println("Создано " + userNumber + (" коробок размера " + sizeString + ".\n У всех коробок цвет : " + userColor));

                break;
            default:
                System.out.println("Выберите размер коробки из списка");

        }

        printOutCount();

    }
}



