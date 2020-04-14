package ru.innopolis.stc.java.lesson9.task3;

public class Man extends Person {

    String name;
    int age;
    int energy;
    int health;

    Man(String name, int age, int energy,int health){
    }

    @Override
    public void running() {
        System.out.println("Man is running");
        energy -= 10;
        health+=10;
    }
    @Override
    public void swimming() {
        System.out.println("Man is swimming");
        energy -= 20;
        health+=20;
    }
}
