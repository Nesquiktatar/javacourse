package ru.innopolis.stc.java.lesson6.task3;

public class Truck extends Car {

    public Truck(String number, String color) {
        super(number, color);
    }


    public void unload() {
        System.out.println("Камаз отцепляет прицеп.");
    }


}
