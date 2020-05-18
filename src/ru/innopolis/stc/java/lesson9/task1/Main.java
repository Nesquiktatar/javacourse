package ru.innopolis.stc.java.lesson9.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какое животное хотите добавить?\nDuck\nDog\nCat");
        Scanner inputScanner = new Scanner(System.in);
        String user = inputScanner.next();

        System.out.println("Enter the name of the animal:");
        String userName = inputScanner.next();
        System.out.println("Enter the color of the animal:");
        String userColor = inputScanner.next();
        System.out.println("Enter the age of the animal:");
        int userAge = inputScanner.nextInt();

        switch (user) {
            case ("Duck"): {
                Duck duck = new Duck(userAge, userName, userColor);
                System.out.printf("You created the animal - %s\nName %s\nColor %s\nAge %s", duck.getType(), userName, userColor, userAge);
                System.out.println("\nI'll show you, what he can do.");
                duck.swimming();
                duck.flying();
                duck.running();
            }
            break;
            case ("Dog"): {
                Dog dog = new Dog(userAge, userName, userColor);
                System.out.printf("You created the animal - %s\nName %s\nColor %s\nAge %s", dog.getType(), userName, userColor, userAge);
                System.out.println("\nI'll show you, what he can do.");
                dog.swimming();
                dog.running();
            }break;
            case ("Cat"): {
                Cat cat = new Cat(userAge, userName, userColor);
                System.out.printf("You created the animal - %s\nName %s\nColor %s\nAge %s", cat.getType(), userName, userColor, userAge);
                System.out.println("\nI'll show you, what he can do.");
                cat.running();
            }
            break;
            default:
                System.out.println("Please enter Duck or Cat or Dog.");
        }
    }
}
