package ru.innopolis.stc.java.lesson3.task4;

import java.util.Random;
import java.util.Scanner;

public class Hot_Cold {
    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt(100);

        System.out.println(num);

        System.out.println("Input your number (from 1 to 100)");
        Scanner in = new Scanner(System.in);
        int user1 = (int) in.nextDouble();

        int differencebefore = num;
        int differenceafter1;


        differenceafter1 = differencebefore - user1;


        if (user1 == num) {
            System.out.println("Congratulations! You guessed the number!");
        } else if (Math.abs(differenceafter1) > differencebefore) {
            System.out.println("Cold");
        } else if (Math.abs(differenceafter1) < differencebefore) {
            System.out.println("Hot");
        }

        System.out.println("Try again. Input your number (from 1 to 100)");
        int user2 = (int) in.nextDouble();

        int differenceafter2;

        differenceafter2 = num - user2;

        if (user2 == num) {
            System.out.println("Congratulations! You guessed the number!");
        } else if (Math.abs(differenceafter2) > Math.abs(differenceafter1)) {
            System.out.println("Cold");
        } else if (Math.abs(differenceafter2) < Math.abs(differenceafter1)) {
            System.out.println("Hot");
        }
    }
}

