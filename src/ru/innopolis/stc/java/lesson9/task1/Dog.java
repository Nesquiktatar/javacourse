package ru.innopolis.stc.java.lesson9.task1;

import ru.innopolis.stc.java.lesson9.task2.Run;
import ru.innopolis.stc.java.lesson9.task2.Swim;

public class Dog extends Animal implements Run, Swim {



    protected Dog(int age, String name, String color) {
        super(age, color);
    }

    @Override
    public String getName() {
        return null;
    }

    public AnimalType getType() {
        return AnimalType.DOG;
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
