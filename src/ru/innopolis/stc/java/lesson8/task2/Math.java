package ru.innopolis.stc.java.lesson8.task2;

import static ru.innopolis.stc.java.lesson8.task2.Calculator.*;

public class Math {
    public static void main(String[] args) {

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
                String userWhatdo = inputScanner.next();

                switch (userWhatdo) {
                    case ("Вычитание"):
                        subtractionInt(a, b);
                        break;
                    case ("Сложение"):
                        additionInt(a, b);
                        break;
                    case ("Умножение"):
                        multiplicationInt(a, b);
                        break;
                    case ("Деление"):
                        divisionInt(a, b);
                        break;
                    case ("Взять процент от числа"):
                        percentInt(a, b);
                        break;
                    default:
                        System.out.println("Извините, но на данный момент калькулятор может выполнить только " +
                                "вышеперечисленные операции");
                }
                break;

            case ("Double"):
                System.out.println("Введите первое число:");
                double ad = inputScanner.nextDouble();
                System.out.println("Введите второе число:");
                double bd = inputScanner.nextDouble();

                System.out.println("Какую операцию вы хотите сделать?\nВычитание\nСложение\nУмножение\nДеление" +
                        "\nВзять процент от числа");
                String userWhatdoD = inputScanner.next();
                switch (userWhatdoD) {
                    case ("Вычитание"):
                        subtractionDoule(ad, bd);
                        break;
                    case ("Сложение"):
                        additionDouble(ad, bd);
                        break;
                    case ("Умножение"):
                        multiplicationDouble(ad, bd);
                        break;
                    case ("Деление"):
                        divisionDouble(ad, bd);
                        break;
                    case ("Взять процент от числа"):
                        percentDouble(ad, bd);
                        break;
                    default:
                        System.out.println("Извините, но на данный момент калькулятор может выполнить только " +
                                "вышеперечисленные операции");
                }
                break;
            default:
                System.out.println("Введите Double или Int");
        }
    }
}
