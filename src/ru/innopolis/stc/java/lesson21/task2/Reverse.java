package ru.innopolis.stc.java.lesson21.task2;

public class Reverse {
    public static void main(String[] args) {


        int[]MyArray = new int[4];

        System.out.println("Массив до переставления:");
        for (int z = 0; z < 4; z++) {
                MyArray[z] = (int) (Math.random() * 100);
                System.out.printf("%d ", MyArray[z]);
            }

        int [] ReverseArray = new int[4];

        for (int i = 0; i <ReverseArray.length; i++) {
            ReverseArray[i]=MyArray[MyArray.length-1-i];
        }

        System.out.println();
        System.out.println("Массив после переставления:");
        for (int z = 0; z < 4; z++) {
            System.out.printf("%d ", ReverseArray[z]);
        }

    }

    }

