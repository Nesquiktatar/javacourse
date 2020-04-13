package ru.innopolis.stc.java.lesson6.task3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Car {

    private String typeOfCar;
    private String color;

    public Car(String typeOfCar, String color) {
        System.out.println("Добавили новый грузовик в класс \"Грузовые авто\"");
        this.typeOfCar = typeOfCar;
        this.color = color;
    }

    public static void consumption(int kilometers, int liters) {
        int consumption = liters * 100 / kilometers;
        System.out.println("Расход вашего авто: " + consumption + " л/100км");
    }

    public void lights() {
        System.out.println("Фары включены!");
    }


    public static void main(String[] args) {

        System.out.println("Добавим новый авто?");
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Введите тип грузовика:");
        String typeOfCar = inputScanner.next();

        System.out.println("Введите цвет грузовика:");
        String color = inputScanner.next();

        System.out.println("Для добавления в базу данных, так же нужно знать расход автомобиля." +
                "Если вы не помните давайте рассчитаем." +
                "\nСколько литров вы заправили?");
        int litres = inputScanner.nextInt();
        System.out.println("На сколько километров хватило?");
        int kilometres = inputScanner.nextInt();

        consumption(kilometres, litres);

        Truck newTruck = new Truck(typeOfCar, color);


        System.out.println("Проверим техническое состояние. Включите фары: ");
        newTruck.lights();

        System.out.println("Проверим техническое состояние. Отцепите прицеп : ");
        newTruck.unload();

    }
}
