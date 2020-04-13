package ru.innopolis.stc.java.lesson6.task1;
//Наследование
public class Animal {

    public static void main(String[] args) {

    Dog dog1 = new Dog ("Tuzik", 2);
    String dog1Name = dog1.getName();
    int dog1Age = dog1.getAge();

        System.out.println("Возраст собаки по имени " +  dog1Name + " - "+ dog1Age + "\n" + "Она может:");
        System.out.print("Прыгать: ");
        dog1.jump();
        System.out.print("Лаять: ");
        dog1.sayGav();

        System.out.println();

    Cat cat1 = new Cat();
    cat1.setName("Murzik");
    cat1.setAge(5);

    String cat1Name = cat1.getName();
    int cat1Age = cat1.getAge();

        System.out.println("Возраст кошки по имени " + cat1Name + " - "+ cat1Age + "\n" + "Она может:");
        System.out.print("Спать: ");
        cat1.sleep();
        System.out.print("Пить: ");
        cat1.drink();

    }

}