package ru.innopolis.stc.java.lesson4.task4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MathProgression {
    public static void main(String[] args) {
        String choose;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("What progression you want to start? \n Choose : arithmetic or geometric.");

        choose = inputScanner.nextLine();


        switch (choose) {
            case "arithmetic":

                System.out.println("Where you want to start?");

                int start = inputScanner.nextInt();

                System.out.println("number of steps?");

                int numberOfSteps = inputScanner.nextInt();

                System.out.println("Your step?");

                int step = inputScanner.nextInt();

                for (int i = 0; i < numberOfSteps; i++) {

                    int total1;

                    total1 = start + i * step;
                    System.out.println(total1);
                };
                break;

            case "geometric":
                System.out.println("Where you want to start?");

                double start2 = inputScanner.nextDouble();

                System.out.println("number of steps?");

                int numberOfSteps2 = inputScanner.nextInt();

                System.out.println("Your step?");

                int step2 = inputScanner.nextInt();

                for (int i = 1; i <= numberOfSteps2; i++) {

                    double total2;
                    total2 = start2 * Math.pow(step2, i);
                    System.out.println(total2);
                }
                ;
                break;

            default:
                System.out.println("Please enter arithmetic or geometric.");
        }


    }
}

