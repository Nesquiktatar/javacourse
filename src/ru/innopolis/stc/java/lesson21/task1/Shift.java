package ru.innopolis.stc.java.lesson21.task1;

public class Shift {
    public static void main(String[] args) {

        int[][] MyArray = new int[4][6];

        System.out.println("Массив до сдвига:");
        for(int z=0;z<4;z++) {
            System.out.println();
            for (int x = 0; x < 6; x++) {
                MyArray[z][x] = (int) (Math.random() * 100);
                System.out.printf("%d ", MyArray[z][x]);
            }
        }

        int next;
        for (int i = 0; i < MyArray.length; i++) {
            for (int j = 0; j < MyArray[0].length; j++) {
                if (j + 1 < MyArray[0].length) {
                    next = MyArray[i][j + 1];
                } else {
                    next = 0;
                }
                MyArray[i][j] = next;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Массив после сдвига:");

        for(int z=0;z<4;z++) {
            System.out.println();
            for (int x = 0; x < 6; x++) {
                System.out.printf("%d ", MyArray[z][x]);
            }
        }
    }
}
