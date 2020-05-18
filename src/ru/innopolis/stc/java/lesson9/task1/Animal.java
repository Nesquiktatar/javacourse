package ru.innopolis.stc.java.lesson9.task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public abstract class Animal {

    private int age;
    private String color;
    private String name;

    public Animal(int age, String name, String color) {
        this.age=age;
        this.name=name;
        this.color=color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();



}
