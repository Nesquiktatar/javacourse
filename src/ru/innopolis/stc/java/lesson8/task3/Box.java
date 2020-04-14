package ru.innopolis.stc.java.lesson8.task3;

public class Box {
    public static int boxNumber = 0;
    private char size;
    private String color;
    private int cost;

    Box(char size, String color, int cost) {
        boxNumber++;
    }


    public static void printOutCount() {
        System.out.println("Поздравляю! Мы в сумме выпустили " + boxNumber + " коробок.");
    }


}
