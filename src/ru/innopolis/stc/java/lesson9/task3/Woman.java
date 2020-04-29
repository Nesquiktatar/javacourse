package ru.innopolis.stc.java.lesson9.task3;

public class Woman extends Person {

   private String name;
    private int age;
    private int energy;
    private int health;

    Woman(String name, int age, int energy,int health){
        this.name=name;
        this.age=age;
        this.energy=energy;
        this.health=health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHealth() {
        return health;
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
