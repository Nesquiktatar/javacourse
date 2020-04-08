package ru.innopolis.stc.java.lesson6.task3;

public class Car {

    private String number; // номер авто
    public int consumption; // расход
    private String color; // цвет

    public Car(String number, int consumption, String color) {
        this.number = number;
        this.consumption = consumption;
        this.color = color;
    }

    public void lights() {
        System.out.println("Lights on!");
    }
}

public class Truck extends Car(String number, int consumption, String color) {

    this.number = number;
    this.consumption = consumption;
    this color = color;

    public void unload() {
        System.out.println("Unloading the content");
    }

    public static void main(String[] args) {
        Truck kamaz = new Truck();
        kamaz.unload();
        kamaz.lights();
    }
}