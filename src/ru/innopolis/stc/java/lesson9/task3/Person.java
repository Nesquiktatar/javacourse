package ru.innopolis.stc.java.lesson9.task3;

import ru.innopolis.stc.java.lesson9.task2.Run;
import ru.innopolis.stc.java.lesson9.task2.Swim;

import java.util.Scanner;

public abstract class Person implements Run, Swim {
    public static void main(String[] args) {

        System.out.println("Who do you want to add?\nPlease enter:\nM-for man\nW-for woman");
        Scanner inputScanner = new Scanner(System.in);
        String userType = inputScanner.next();
        System.out.println("Enter person name:");
        String userName = inputScanner.next();
        System.out.println("Enter person age:");
        int userAge = inputScanner.nextInt();
        System.out.println("Enter person energy:");
        int userEnergy = inputScanner.nextInt();
        System.out.println("Enter person health:");
        int userHealth = inputScanner.nextInt();

        if (userType.equals("W")) {
            Woman woman = new Woman(userName, userAge, userEnergy, userHealth);
            System.out.println("What you want her to do? Run or Swim?");
            String userChoice = inputScanner.next();
            if (userChoice.equals("Run")) {
                woman.running();
                System.out.printf("Now %s have %s energy and %s health", userName, (userEnergy + woman.getEnergy()), userHealth + woman.getHealth());
            } else if (userChoice.equals("Swim")) {
                woman.swimming();
                System.out.printf("Now %s have %s energy and %s health", userName, userEnergy + woman.getEnergy(), userHealth + woman.getHealth());
            } }else if (userType.equals("M")) {
                Man man = new Man(userName, userAge, userEnergy, userHealth);
                System.out.println("What you want him to do? Run or Swim?");
                String userChoice2 = inputScanner.next();
                if (userChoice2.equals("Run")) {
                    man.running();
                    System.out.printf("Now %s have %s energy and %s health", userName, (userEnergy + man.getHealth()), userHealth + man.getHealth());
                } else if (userChoice2.equals("Swim")) {
                    man.swimming();
                    System.out.printf("Now %s have %s energy and %s health", userName, userEnergy + man.getEnergy(), userHealth + man.getHealth());
                }
            }
        }
    }


