package ru.innopolis.stc.java.lesson9.task1;

import ru.innopolis.stc.java.lesson9.task2.Fly;
import ru.innopolis.stc.java.lesson9.task2.Run;
import ru.innopolis.stc.java.lesson9.task2.Swim;

public  class Duck  extends Animal implements Fly, Run, Swim {


    protected Duck(int age, String name, String color) {
        super(age, name, color);
    }

    @Override
    public String getType() {
        return String.valueOf(Type.DUCK);
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
