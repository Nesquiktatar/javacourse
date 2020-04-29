package ru.innopolis.stc.java.lesson8.task2;


import java.util.Scanner;

import static ru.innopolis.stc.java.lesson8.task2.Calculator.*;


public class Math {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Над какими числами вы хотите произвести операции?\nDouble или Int ");
        String userDoubleOrInt = inputScanner.next();

        switch (userDoubleOrInt) {
            case ("Int"):
                System.out.println("Введите первое число:");
                int a = inputScanner.nextInt();
                System.out.println("Введите второе число:");
                int b = inputScanner.nextInt();

                System.out.println("Какую операцию вы хотите сделать?\nВычитание\nСложение\nУмножение\nДеление" +
                        "\nВзять процент от числа");
                String userWhatToDo = inputScanner.next();

                switch (userWhatToDo) {
                    case ("Вычитание"):
                        System.out.printf("Результат разности между %s и %s = %s", a, b, subtractionInt(a, b));
                        break;
                    case ("Сложение"):
                        System.out.printf("Результат сложения между %s и %s = %s", a, b, additionInt(a, b));
                        break;
                    case ("Умножение"):
                        System.out.printf("Результат умножения между %s и %s = %s", a, b, multiplicationInt(a, b));
                        break;
                    case ("Деление"):
                        System.out.printf("Результат деления между %s и %s = %s", a, b, divisionInt(a, b));
                        break;
                    case ("Взять процент от числа"):
                        System.out.printf("Результат взятия процента между %s и %s = %s", a, b, percentInt(a, b));
                        break;
                    default:
                        System.out.println("Извините, но на данный момент калькулятор может выполнить только " +
                                "вышеперечисленные операции");
                }
                break;

            case ("Double"):
                System.out.println("Введите первое double число:");
                double ad = inputScanner.nextDouble();
                System.out.println("Введите второе double число или какой процент от первого числа:");
                double bd = inputScanner.nextDouble();

                System.out.println("Какую операцию вы хотите сделать?\nВычитание\nСложение\nУмножение\nДеление" +
                        "\nВзять процент от числа");
                String userWhatdoD = inputScanner.next();
                switch (userWhatdoD) {
                    case ("Вычитание"):
                        System.out.printf("Результат разности между %s и %s = %s", ad, bd, subtractionDouble(ad, bd));
                        break;
                    case ("Сложение"):
                        System.out.printf("Результат сложения между %s и %s = %s", ad, bd, additionDouble(ad, bd));
                        break;
                    case ("Умножение"):
                        System.out.printf("Результат умножения между %s и %s = %s", ad, bd, multiplicationDouble(ad, bd));
                        break;
                    case ("Деление"):
                        System.out.printf("Результат деления между %s и %s = %s", ad, bd, divisionDouble(ad, bd));
                        break;
                    case ("Взять процент от числа"):
                        System.out.println("fafa");
                        System.out.printf("Результат разности между %s и %s = %s", ad, bd, percentDouble(ad, bd));
                        break;
                    default:
                        System.out.println("Введите Double или Int");
                }
        }
    }
}