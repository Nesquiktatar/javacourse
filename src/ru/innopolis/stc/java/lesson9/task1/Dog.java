package ru.innopolis.stc.java.lesson9.task1;

import ru.innopolis.stc.java.lesson9.task2.Run;
import ru.innopolis.stc.java.lesson9.task2.Swim;

public class Dog extends Animal implements Run, Swim {

    private int age;
    private String color;
    private String name;
    private String type="dog";

    Dog(int age, String name, String color) {
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void running() {
        System.out.println("Dog is running!");
    }

    @Override
    public void swimming() {
        System.out.println("Dog is swimming!");
    }
}
