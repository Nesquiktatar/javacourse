package ru.innopolis.stc.java.lesson9.task1;

import ru.innopolis.stc.java.test.Anonymous;

import java.sql.SQLOutput;
import java.util.Scanner;

public abstract class Animal {

    private int age;
    private String color;


    public Animal(int age, String color) {
        this.age=age;
        this.color=color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getName();

    public abstract AnimalType getType();

}
