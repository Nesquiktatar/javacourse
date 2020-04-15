package ru.innopolis.stc.java.lesson11.task1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Censor {
    public static void main(String[] args) {


        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String user = inputScanner.nextLine();

        String userCensored = user.replace("бяка","вырезано цензурой ");
        System.out.println("Упс, добавим цензуру.");
        System.out.println(userCensored);
    }
}
