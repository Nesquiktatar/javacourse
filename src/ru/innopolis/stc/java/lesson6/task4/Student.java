package ru.innopolis.stc.java.lesson6.task4;

public class Student {

    private String name;
    private int age;
    private char sex;


    public Student(String name, int age, char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    private Group home;
    public Student (Group groupNumber){
        this.home=groupNumber;
    }

    void payMoney(int payRub){
        System.out.println(name + " сдает " + payRub + " рублей.");
    }

}
