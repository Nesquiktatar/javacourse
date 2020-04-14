package ru.innopolis.stc.java.lesson9.task1;

import ru.innopolis.stc.java.lesson9.task2.Fly;
import ru.innopolis.stc.java.lesson9.task2.Run;
import ru.innopolis.stc.java.lesson9.task2.Swim;

public class Duck  extends Animal implements Fly, Run, Swim {
    int age;
    String color;
    String name;
    String type = "duck";

    Duck(int age, String name, String color) {
    }


    @Override
    public String getType() {
        return type;
    }


    @Override
    public void flying() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void running() {
        System.out.println("Duck is running!");

    }

    @Override
    public void swimming() {
        System.out.println("Duck is swimming!");

    }
}
