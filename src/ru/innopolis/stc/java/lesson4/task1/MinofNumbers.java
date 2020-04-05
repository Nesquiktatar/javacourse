package ru.innopolis.stc.java.lesson4.task1;

import java.util.Scanner;

public class MinofNumbers {
    public static void main(String[] args) {
        double first, second;

        System.out.println("Enter your first number: ");

        Scanner inputScanner = new Scanner(System.in);
         first=inputScanner.nextDouble();

        System.out.println("Enter your second number: ");

        second = inputScanner.nextDouble();

        if (first<second) {
            System.out.println("First is minimum.");
        }else if(first==second){
            System.out.println("Your numbers are equal");
        }else{
            System.out.println("Second is minimum.");

        }
    }
}
