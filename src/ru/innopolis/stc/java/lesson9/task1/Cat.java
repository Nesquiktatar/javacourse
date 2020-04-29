package ru.innopolis.stc.java.lesson9.task1;

import ru.innopolis.stc.java.lesson9.task2.Run;

public class Cat extends Animal implements Run {


    String type="cat";

    protected Cat(int age, String name, String color) {
        super(age, name, color);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void running() {
        System.out.println("Cat is running!");
    }
}
