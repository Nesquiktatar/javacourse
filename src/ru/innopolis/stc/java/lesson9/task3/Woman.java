package ru.innopolis.stc.java.lesson9.task3;

public class Woman extends Person {

    String name;
    int age;
    int energy;
    int health;

    Woman(String name, int age, int energy,int health){
    }
    @Override
    public void running() {
        System.out.println("Woman is running.");
        energy -=15;
        health+=15;
    }

    @Override
    public void swimming() {
        System.out.println("Woman is swimming.");
        energy -= 30;
        health+=30;
    }
}
