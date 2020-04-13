package ru.innopolis.stc.java.lesson6.task1;

public class Cat {

    private String name;
    int age;

    void sleep() {
        System.out.println("Кошка спит.");
    }

    void drink() {
        System.out.println("Кошка пьет.");
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
